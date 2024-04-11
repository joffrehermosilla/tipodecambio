package backend.joffre.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public interface ApiService {


	
	@GetMapping("/tipodecambioglobal")
	public List<Object> getTipodeCambioWorlwide();
	
	
	
}
