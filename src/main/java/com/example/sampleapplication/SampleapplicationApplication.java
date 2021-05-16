package com.example.sampleapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value = SampleapplicationApplicationConfig.class)
public class SampleapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleapplicationApplication.class, args);
	}

}
