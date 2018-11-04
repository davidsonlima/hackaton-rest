package br.com.xumappdev.brasleverp.brasleverp;

import br.com.xumappdev.brasleverp.brasleverp.service.MockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class BraslevErpApplication {

	@Autowired
	private MockService mockService;

	public static void main(String[] args) {
		SpringApplication.run(BraslevErpApplication.class, args);
	}
}
