/**
 * 
 */
package com.raj.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Rajendar Kumar
 *
 */
@SpringBootApplication
@ComponentScan("com.raj.*")
public class MainApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SpringApplication.run(MainApplication.class, args);
	}

}
