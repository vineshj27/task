package com.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jApplication {
	
	static Logger log = Logger.getLogger(Log4jApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4jApplication.class, args);
//	 
//		BasicConfigurator.configure();
//		log.info("Inforamtion");
//		log.error("Error");
//		log.warn("warning");
//		log.fatal("critical error");
//		log.debug("debugging");
//		
		PropertyConfigurator.configure("log4j.properties");
		log.info("Inforamtion");
 		log.error("Error");
 		log.warn("warning");
 		log.fatal("critical error");
 		log.debug("debugging");
			
	}

}
