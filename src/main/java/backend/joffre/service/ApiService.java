package backend.joffre.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public interface ApiService {

	@GetMapping("/v6/latest/USD")
	public List<Object> getTipodeCambioDolares();
	
	@GetMapping("/tipodecambioglobal")
	public List<Object> getTipodeCambioWorlwide();
	
	
	
}
