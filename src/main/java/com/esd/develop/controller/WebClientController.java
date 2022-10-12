package com.esd.develop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.esd.develop.model.Angle;

//SOAP -- SOAP request SOAP response   ... xml  -- we use xml parsing..  https x503 == key public 
// user define tag  , avoid empty tag 
// JAX-WS ,JAX-RS 
//SOAP - UUID register
//html - pre define tag ..  DOM .. 
//REST JSON - > javascript object - > parse with interfence in browser ... light process 
// Eruaka Server . 
@RestController
public class WebClientController {
	

	@Autowired
	WebClient.Builder builderClient;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	
	@GetMapping("findAngleInfoById/{id}")
	public Angle findAngleInfoById(@PathVariable ("id") Long id) {
	
		
    Angle object =	builderClient.build()
		             .get() // getMaping .. 
		             .uri("http://localhost:8181/getAngleById/"+id)
		             .retrieve()
		             .bodyToMono(Angle.class)  // asynchornous 
		             .block();
		
		return object;
	}
	
	
	@GetMapping("getAllAngleRecord")
	public Angle[] getAllAngleRecord() {

	    Angle [] lstAngle;
		lstAngle = restTemplate.getForObject("http://localhost:8181/allAngleRecord",Angle[].class);
		 
		
		for (Angle ang : lstAngle)
		 System.out.println(ang);
		
		return lstAngle;
		  
	
	}
}
