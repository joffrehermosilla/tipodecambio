package backend.joffre.application.usecases;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public interface ApiService {


	
	@GetMapping("/tipodecambioglobal")
	public List<Object> getTipodeCambioWorlwide();
	
	
	
}
