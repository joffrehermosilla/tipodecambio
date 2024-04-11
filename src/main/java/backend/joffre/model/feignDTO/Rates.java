package backend.joffre.model.feignDTO;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class Rates {
	@JsonAlias("USD")
	private Double usd;
	@JsonAlias("EUR")
	private Double eur;
	@JsonAlias("JPY")
	private Double jpy;
	@JsonAlias("MXN")
	private Double mxn;
	@JsonAlias("PEN")
	private Double pen;

}
