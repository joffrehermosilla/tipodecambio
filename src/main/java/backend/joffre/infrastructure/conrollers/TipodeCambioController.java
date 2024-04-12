package backend.joffre.infrastructure.conrollers;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
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
import backend.joffre.application.usecases.UsuarioService;
import backend.joffre.domain.feignDTO.ExchangeRate;
import backend.joffre.domain.feignDTO.Rates;
import backend.joffre.domain.models.Usuario;
import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/tipodecambio")
@RequiredArgsConstructor
//@EnableFeignClients(basePackageClasses = ApiServiceProxy.class)
public class TipodeCambioController {
	private final Logger LOGGER = LoggerFactory.getLogger(getClass());
	@Autowired
	private ApiServiceProxy serviceproxy;

	@GetMapping("/dolares")
	public ResponseEntity<ExchangeRate> getDolares() {

		LOGGER.info("service externo : " + serviceproxy.getTipodeCambioDolares());
		return new ResponseEntity<>(serviceproxy.getTipodeCambioDolares(), HttpStatus.OK);
	}

}