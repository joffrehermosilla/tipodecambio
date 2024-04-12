package backend.joffre.infraestructure.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.annotation.JsonAlias;

import backend.joffre.application.services.ApiServiceProxy;
import backend.joffre.domain.feignDTO.ExchangeRate;
import backend.joffre.domain.feignDTO.Rates;
import backend.joffre.infrastructure.conrollers.TipodeCambioController;
import backend.joffre.resources.FileToObjectLoader;

@ExtendWith(MockitoExtension.class)
public class TipodeCambioControllerTest {

	@InjectMocks
	TipodeCambioController controller;

	@Mock
	private ApiServiceProxy serviceproxy;

	ExchangeRate exchange;
	Rates rates;

	@BeforeEach
	void setUp() throws IOException {

		//exchange = FileToObjectLoader.readDataFromFile("/ratetraces.json", ExchangeRate.class);
		rates = new Rates();
		exchange = new ExchangeRate();
		exchange.setResult("success");
		exchange.setProvider("https://www.exchangerate-api.com");
		exchange.setDocumentation("https://www.exchangerate-api.com/docs/free");
		exchange.setTermsOfUse("https://www.exchangerate-api.com/terms");
		exchange.setTimeLastUpdateUnix(1712793751);
		exchange.setTimeNextUpdateUnix(1712882141);

		exchange.setTimeEolUnix(0);
		exchange.setBaseCode("USD");
		rates.setUsd(1.0);
		rates.setEur(0.928835);
		rates.setJpy(152.62068);
		rates.setPen(3.701894);
		rates.setMxn(16.467816);
		exchange.setRates(rates);

	}

	@Test
	@DisplayName("Return Dolar Rates ")
	void returnGetDolaresTest() {

		when(serviceproxy.getTipodeCambioDolares()).thenReturn(exchange);

		ResponseEntity<ExchangeRate> response = controller.getDolares();

		//verify(serviceproxy).getTipodeCambioDolares();

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(response.getBody());

	}

}
