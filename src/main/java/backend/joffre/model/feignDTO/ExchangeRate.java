package backend.joffre.model.feignDTO;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class ExchangeRate {

	private String baseCode;
	private Date timeLastUpdateUtc;
	private Rates rates;

}
