package singh.mahabir.registry.client;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * This class gets call when info endpoint gets call by eureka to check whether
 * service is up
 *
 * @author Mahabir Singh
 *
 */
@Component
public class CustomHealthCheck implements HealthIndicator {

    int erroCode = 0;

    @Override
    public Health health() {
	System.out.println("Health Check performed. error code is " + erroCode);
	if (erroCode > 4 && erroCode < 8) {
	    erroCode++;
	    return Health.down().withDetail("Custom Error Code", erroCode).build();
	}
	erroCode++;
	return Health.up().build();
    }

}
