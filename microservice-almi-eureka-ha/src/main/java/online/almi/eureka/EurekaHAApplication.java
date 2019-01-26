package online.almi.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka HA Service Governance Starter
 * 
 * @author ChunYong-Zhang
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaHAApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(EurekaHAApplication.class, args);
	}
}
