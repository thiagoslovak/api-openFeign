package br.com.openFeign.apiopenFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiOpenFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiOpenFeignApplication.class, args);
	}

}
