package com.esd.develop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import com.esd.develop.model.Angle;

public class RestCall {
	


	public static void main(String[] args) {
		
		 RestTemplate restTemplate = new RestTemplate();
		 Angle angle = restTemplate.getForObject("http://localhost:8181/getAngleById/{id}", Angle.class,21);
		 
		 System.out.println("angle Name :"+angle.getEmail()); 
		 
		 
		
		 

		 
		 
		 
		 
		 /*
		  final String uri = "http://localhost:8181/addAngle";
		  
		     Angle obj = new Angle();
		     
		    InterestArea ar = new InterestArea();
		     
		      ar.setArea("Child worker-XY");
		      ar.setDetail("working for childrens");
	
		     obj.setAddress("Test-XY");
		     obj.setContact("8975442345");
		     obj.setEmail("Test-XY@gmail.com");
		     obj.setInterestArea(ar);
		     
		     
		     Angle angleObject = restTemplate.postForObject( uri, obj, Angle.class);
		     System.out.println(angleObject.toString());  
		*/
		 	
		     //RestTemplate restTemplate = new RestTemplate();
		     Angle [] lstAngle;
			lstAngle = restTemplate.getForObject("http://localhost:8181/allAngleRecord",Angle[].class);
			 
			
			for (Angle ang : lstAngle)
			 System.out.println(ang);
			  

	}

}
