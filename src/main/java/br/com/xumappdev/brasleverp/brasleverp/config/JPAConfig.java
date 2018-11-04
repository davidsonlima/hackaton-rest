package br.com.xumappdev.brasleverp.brasleverp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(value = "br.com.xumappdev.brasleverp.brasleverp.repository")
public class JPAConfig {

}
