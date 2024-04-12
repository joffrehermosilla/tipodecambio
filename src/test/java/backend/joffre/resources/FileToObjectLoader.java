package backend.joffre.resources;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import backend.joffre.infraestructure.controllers.TipodeCambioControllerTest;

public class FileToObjectLoader {
	
	
	private static final ObjectMapper mapper;

	static {
		mapper = new ObjectMapper();
		mapper.findAndRegisterModules();
	}
	
	public static <T> T readDataFromFile(String fileName, Class<T> tdClass) throws IOException {
		return mapper.readValue(FileToObjectLoader.class.getClassLoader().getResourceAsStream(fileName),
				tdClass);
	}
}
