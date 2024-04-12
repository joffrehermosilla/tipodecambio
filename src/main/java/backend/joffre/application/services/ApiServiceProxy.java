package backend.joffre.application.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import backend.joffre.domain.feignDTO.ExchangeRate;
import backend.joffre.domain.feignDTO.Rates;
import backend.joffre.infrastructure.config.FeignClientConfig;


@FeignClient(name = "api-service", url = "${external.mock.api.base-url}", configuration = FeignClientConfig.class)
public interface ApiServiceProxy {

	@GetMapping(value = "USD", consumes = MediaType.APPLICATION_JSON_VALUE)
	ExchangeRate getTipodeCambioDolares();
	
	@GetMapping(value = "PEN", consumes = MediaType.APPLICATION_JSON_VALUE)
	ExchangeRate getTipodeCambioSoles();
	
	@GetMapping(value = "MXN", consumes = MediaType.APPLICATION_JSON_VALUE)
	ExchangeRate getTipodeCambioPesosmexicanos();
	
	@GetMapping(value = "EUR", consumes = MediaType.APPLICATION_JSON_VALUE)
	ExchangeRate getTipodeCambioEUROS();
	
	@GetMapping(value = "JPY", consumes = MediaType.APPLICATION_JSON_VALUE)
	ExchangeRate getTipodeCambioYenes();
}
