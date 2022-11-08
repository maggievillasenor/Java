package org.generation.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //necesario para levantar api
public class ControladorInicio {
	
	@GetMapping("/saludo") // localhost:8080/saludo //necesario para levantar api
	public String saludo() {
		return "Holi Crayoli desde Spring Boot";
	}

}
