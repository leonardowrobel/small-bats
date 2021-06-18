package br.com.smallbats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 	A anotação @SpringBootApplication é composta das anotações:
* 	@EnableAutoConfiguration
* 	@ComponentScan
* 	@Configuration
* */
@SpringBootApplication
public class SmallBatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallBatsApplication.class, args);
	}

}
