package com.cesar.project.learnspringframework.sample.enterprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesar.project.learnspringframework.sample.enterprise.flow.business.BusinessService;

/*
In the pom.xml I have created a new dependency: 
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
</dependency>

With that I create a Web application, that does not stop in the terminal,
but allows me to use "commands" with the GetMapping through an explorer via
 localhost:8080
for example: 
localhost:8080/sum
*/

//Responsible of sending the response in the right format
@RestController
public class Controller {

	@Autowired
	private BusinessService busService;

	// I want to response to "/sum" returning the sum:
	@GetMapping("/sum")
	public long displaySum() {
		return busService.getSum();
	}

}
