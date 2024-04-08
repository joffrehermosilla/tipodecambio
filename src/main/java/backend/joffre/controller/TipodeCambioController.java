package backend.joffre.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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

import backend.joffre.model.Usuario;
import backend.joffre.service.UsuarioService;
import backend.joffre.service.impl.ApiServiceProxy;
import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/tipodecambio")
@EnableFeignClients(basePackageClasses = ApiServiceProxy.class)
public class TipodeCambioController implements ApiServiceProxy {

	private ApiServiceProxy serviceproxy;

	@Override
	@GetMapping("/v6/latest/USD")
	public List<Object> getTipodeCambioDolares() {
		// TODO Auto-generated method stub
		return serviceproxy.getTipodeCambioDolares();
	}

	@Override
	@GetMapping("/tipodecambioglobal")
	public List<Object> getTipodeCambioWorlwide() {
		// TODO Auto-generated method stub
		return serviceproxy.getTipodeCambioWorlwide();
	}

}
