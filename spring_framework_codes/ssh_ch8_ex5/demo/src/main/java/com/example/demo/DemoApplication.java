
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.setDefaultProperties(java.util.Map.of(
				"spring.autoconfigure.exclude",
				"org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration"
		));
		app.run(args);
	}

}
