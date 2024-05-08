package com.spring.springvsc;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springvsc.controllers.Logueo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// componenete de los controladores
@RestController

@SpringBootApplication
public class SpringVscApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringVscApplication.class, args);
	}

  @GetMapping("/login")
  
  public Logueo messageView() {
    return new Logueo("ana", "silva", "1234");
  }
  

}
