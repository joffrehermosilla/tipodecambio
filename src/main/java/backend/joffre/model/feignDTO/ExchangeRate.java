package backend.joffre.model.feignDTO;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class ExchangeRate {
	private String result;
	private String provider;
	private String documentation;
	private String terms_of_use;
	private Integer time_last_update_unix;
	private Date time_last_update_utc;
	private Integer time_next_update_unix;
	private Date time_next_update_utc;
	private Integer time_eol_unix;
	private String base_code;
	private Rates rates;

}
