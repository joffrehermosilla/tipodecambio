package backend.joffre.controller;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import backend.joffre.model.Message;

@RestController
public class AppController {

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	@GetMapping("/list")
	public List<Message> list() {
		return Collections.singletonList(new Message("Test list"));
	}

	@PostMapping("/create")
	public Message create(@RequestBody Message message) {

		LOGGER.info("mensaje guardado" + message);
		return message;
	}
	
	@GetMapping("/authorized")
	public Map<String ,String> authorized(@RequestParam String code){
		return Collections.singletonMap("code", code);
	}
	
	
	
}
