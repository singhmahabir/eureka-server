package singh.mahabir.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * @author Mahabir Singh
 *
 */

@SpringBootApplication
/*
 * this annotation is required when you need registry server.
 */
@EnableEurekaServer
public class RegistryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryServerApplication.class, args);
    }
}