package backend.joffre.model.feignDTO;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class Rates {
	@JsonAlias("USD")
	private Double USD;
	@JsonAlias("EUR")
	private Double EUR;
	@JsonAlias("JPY")
	private Double JPY;
	@JsonAlias("MXN")
	private Double MXN;
	@JsonAlias("PEN")
	private Double PEN;

}
