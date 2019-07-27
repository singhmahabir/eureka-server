package singh.mahabir.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Main class to start registry server
 * 
 * @author Mahabir Singh
 *
 */

@SpringBootApplication

/*
 * This annotation is required when you need registry server to work.
 */
@EnableEurekaServer
public class RegistryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryServerApplication.class, args);
    }
}