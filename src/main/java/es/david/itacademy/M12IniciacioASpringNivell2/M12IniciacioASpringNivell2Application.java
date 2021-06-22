package es.david.itacademy.M12IniciacioASpringNivell2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class M12IniciacioASpringNivell2Application {

	public static void main(String[] args) {

		SpringApplication.run(M12IniciacioASpringNivell2Application.class, args);

	}

	@GetMapping("/holaNivell2")
	public String saludo(@RequestParam(value="nombre", defaultValue = "ITAcademy") String nombre){
		return String.format("Hola %s", nombre);
	}

}
