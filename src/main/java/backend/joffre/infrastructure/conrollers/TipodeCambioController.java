package backend.joffre.infrastructure.conrollers;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.joffre.application.services.ApiServiceProxy;
import backend.joffre.application.services.TipodeCambioServiceImpl;
import backend.joffre.application.usecases.PerfilService;
import backend.joffre.application.usecases.TipodeCambioService;
import backend.joffre.application.usecases.UsuarioService;
import backend.joffre.application.usecases.UsuariotieneTipodeCambioService;
import backend.joffre.domain.feignDTO.ExchangeRate;
import backend.joffre.domain.feignDTO.Rates;
import backend.joffre.domain.models.TipodeCambio;
import backend.joffre.domain.models.Usuario;
import backend.joffre.infrastructure.adapters.FeignClientAbstractFactory;
import backend.joffre.infrastructure.adapters.TipodeCambioFactory;
import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/tipodecambio")
@RequiredArgsConstructor
//@EnableFeignClients(basePackageClasses = ApiServiceProxy.class)
public class TipodeCambioController extends TipodeCambioFactory {
	private final Logger LOGGER = LoggerFactory.getLogger(getClass());
	@Autowired
	private ApiServiceProxy serviceproxy;

	@Autowired
	private TipodeCambioService tipodeCambioService;

	@Autowired
	private PerfilService perfilService;

	@Autowired
	private UsuariotieneTipodeCambioService usuarioTieneCambioService;

	@GetMapping("/dolares")
	public ResponseEntity<ExchangeRate> getDolares() {

		LOGGER.info("service externo : " + serviceproxy.getTipodeCambioDolares());
		return new ResponseEntity<>(serviceproxy.getTipodeCambioDolares(), HttpStatus.OK);
	}

	@GetMapping("/soles")
	public ResponseEntity<ExchangeRate> getSoles() {

		LOGGER.info("service externo : " + serviceproxy.getTipodeCambioSoles());
		return new ResponseEntity<>(serviceproxy.getTipodeCambioSoles(), HttpStatus.OK);
	}

	@GetMapping("/euros")
	public ResponseEntity<ExchangeRate> getEuros() {

		LOGGER.info("service externo : " + serviceproxy.getTipodeCambioEUROS());
		return new ResponseEntity<>(serviceproxy.getTipodeCambioEUROS(), HttpStatus.OK);
	}

	@GetMapping("/yenes")
	public ResponseEntity<ExchangeRate> getYenes() {

		LOGGER.info("service externo : " + serviceproxy.getTipodeCambioYenes());
		return new ResponseEntity<>(serviceproxy.getTipodeCambioYenes(), HttpStatus.OK);
	}

	@GetMapping("/pesosmex")
	public ResponseEntity<ExchangeRate> getPesosMexicanos() {

		LOGGER.info("service externo : " + serviceproxy.getTipodeCambioPesosmexicanos());
		return new ResponseEntity<>(serviceproxy.getTipodeCambioPesosmexicanos(), HttpStatus.OK);
	}

	@Override
	protected FeignClientAbstractFactory creaTipodeCambio() {
		// ABSTRACT FACTORY PATTERN

		return new TipodeCambioServiceImpl(serviceproxy);
	}

	@GetMapping("/getAll/{offset}")
	public Iterable<TipodeCambio> getAllTipodeCambios(@RequestParam Integer pageSize,
			@PathVariable("offset") Integer offset) {
		return tipodeCambioService.buscarTodas(pageSize, offset);
	}

	@PostMapping(value = "/save")
	public ResponseEntity<?> guardarTipodeCambio(@RequestBody TipodeCambio tipodecambio) {

		LOGGER.info("Existen errores");
		return ResponseEntity.status(HttpStatus.CREATED).body(tipodeCambioService.guardarTipodeCambio(tipodecambio));
	}

	@GetMapping("/mostrarelcambio/{idTipodeCambio}")
	public ResponseEntity<?> mostrarTipodeCambios(@PathVariable int idTipodeCambio) {
		Optional<TipodeCambio> tipodecambio = tipodeCambioService.get(idTipodeCambio);

		return ResponseEntity.status(HttpStatus.CREATED).body(tipodecambio.get().getFkpais()
				+ " El Usuario hará su cambio en el Pais " + tipodecambio.get().getValorinicial());
	}

	@GetMapping("/all")
	public ResponseEntity<?> todoslosTiposdeCambio() {
		return ResponseEntity.status(HttpStatus.CREATED).body(tipodeCambioService.buscarTodas());
	}

	@DeleteMapping("/borrar-tipodecambio/{idTipodeCambio}")
	public ResponseEntity<?> borrarUsuario(@PathVariable int idTipodeCambio) {

		tipodeCambioService.eliminar(idTipodeCambio);

		return ResponseEntity.accepted().build();

	}

	@PutMapping("/update/{idTipodeCambio}")

	public ResponseEntity<TipodeCambio> updateusuarios(@PathVariable int idTipodeCambio,
			@RequestBody TipodeCambio tipodecambio) {

		tipodecambio.setId(idTipodeCambio);
		Optional<TipodeCambio> tipodecambios = Optional.ofNullable(new TipodeCambio());
		tipodecambios = tipodeCambioService.get(idTipodeCambio);
		tipodecambios.get().setValorfinal(tipodecambio.getValorfinal());

		return ResponseEntity.status(HttpStatus.CREATED).body(tipodeCambioService.actualizarTipodeCambio(tipodecambio));

	}

}
