package backend.joffre.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
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
import backend.joffre.model.feignDTO.ExchangeRate;
import backend.joffre.service.UsuarioService;
import backend.joffre.service.impl.ApiServiceProxy;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/v6/latest/USD")
@RequiredArgsConstructor
//@EnableFeignClients(basePackageClasses = ApiServiceProxy.class)
public class TipodeCambioController {

	@Autowired
	private ApiServiceProxy serviceproxy;

	@GetMapping()
	public ResponseEntity<ExchangeRate> getAll() {
		return new ResponseEntity<>(serviceproxy.getTipodeCambio(), HttpStatus.OK);
	}

}
