package com.guides.guide1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication rolls 3 annotations together:
 * 
 * @Configuration: tags the class a source of bean definitions for the application context.
 *
 * @EnableAutoConfiguration: tells spring boot to start adding beans based on classpath settings, other beans,
 * 		and various property settings. For example if spring-webmvc is on the classpath this flags the application
 * 		as a web application and activates key behaviors such as setting up a DispatcherServlet.
 *
 * @ComponentScan: tells spring to look for other components, configurations and servicesin the package, allowing
 * 		it to ind the controllers.
 */

@SpringBootApplication
public class Guide1Application {

	public static void main(String[] args) {
		SpringApplication.run(Guide1Application.class, args);
	}

}
