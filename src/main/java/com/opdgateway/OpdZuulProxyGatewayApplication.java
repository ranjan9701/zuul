package com.opdgateway;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPid;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class OpdZuulProxyGatewayApplication {

	private static final Logger LOGGER = LogManager.getLogger(OpdZuulProxyGatewayApplication.class);
	  
	public static void main(String[] args) {
		long time = new Date().getTime();
		SpringApplication.run(OpdZuulProxyGatewayApplication.class, args);
		System.out.println("OPD Zuul Gateway Service Start time : " + (new Date().getTime()-time)/1000 + " seconds.");
		
		LOGGER.info("Process Id: " + new ApplicationPid().toString());
	}

}
