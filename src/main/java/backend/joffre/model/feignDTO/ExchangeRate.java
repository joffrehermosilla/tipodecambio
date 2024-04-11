package backend.joffre.model.feignDTO;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Data;

@Data
public class ExchangeRate {
	private String result;
	private String provider;
	private String documentation;
	@JsonAlias("terms_of_use")
	private String termsOfUse;
	@JsonAlias("time_last_update_unix")
	private Integer timeLastUpdateUnix;
	@JsonAlias("time_last_update_utc")
	private Date timeLastUpdateUtc;
	@JsonAlias("time_next_update_unix")
	private Integer timeNextUpdateUnix;
	@JsonAlias("time_next_update_utc")
	private Date timeNextUpdateUtc;
	@JsonAlias("time_eol_unix")
	private Integer timeEolUnix;
	@JsonAlias("base_code")
	private String baseCode;
	private Rates rates;

}
