package com.sample.metric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application { 
	
	private int qDepth = 100;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RequestMapping(value="/")
	String getAppInfo() {
		return "Demo Application Running On Che";
	}
	
	@RequestMapping(value="/getdepth")
	int getDepth() {
		return qDepth;
	}
	
	@RequestMapping(value="/setdepth")
	String setDepth(@RequestParam int size) {
		qDepth = size;
		return "Queue Depth successfully set to " + size ;
	}
	
	@RequestMapping(value="/resetdepth")
	String resetDepth() {
		qDepth = 100;
		return "Queue Depth successfully reset to 100";
	}
}
