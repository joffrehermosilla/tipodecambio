package backend.joffre.infraestructure.controllers;

import static org.mockito.Mockito.when;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import backend.joffre.application.services.ApiServiceProxy;
import backend.joffre.domain.feignDTO.ExchangeRate;

@ExtendWith(MockitoExtension.class)
public class TipodeCambioControllerTest {

	private static final ObjectMapper mapper;

	static {
		mapper = new ObjectMapper();
		mapper.findAndRegisterModules();
	}

	@InjectMocks
	ApiServiceProxy serviceproxy;

	ExchangeRate exchange;

	public static <T> T readDataFromFile(String fileName, Class<T> tdClass) throws IOException {
		return mapper.readValue(TipodeCambioControllerTest.class.getClassLoader().getResourceAsStream(fileName),
				tdClass);
	}

	@BeforeEach
	void setUp() throws IOException {
		try {
			exchange = TipodeCambioControllerTest.readDataFromFile(
					"tipodecambio/src/test/java/backend/joffre/resources/ratetraces.json",
					ExchangeRate.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	@DisplayName("Return Dolar Rates ")
	void returnGetDolaresTest() throws IOException {
		when(serviceproxy.getTipodeCambioDolares()).thenReturn((ExchangeRate) ResponseEntity.ok());
	}

}
