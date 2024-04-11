package backend.joffre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class TipodecambioApplication {

	public static void main(String[] args) {
		SpringApplication.run(TipodecambioApplication.class, args);
	}

}
