package backend.joffre.service.impl;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import backend.joffre.config.FeignClientConfig;
import backend.joffre.model.feignDTO.ExchangeRate;
import backend.joffre.model.feignDTO.Rates;


@FeignClient(name = "api-service", url = "${external.mock.api.base-url}", configuration = FeignClientConfig.class)
public interface ApiServiceProxy {

	@GetMapping(value = "USD", consumes = MediaType.APPLICATION_JSON_VALUE)
	ExchangeRate getTipodeCambioDolares();

}
