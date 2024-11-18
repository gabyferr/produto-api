package br.com.fatec;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

@Readiness
public class ReadinessCheck implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        if (Produto.listAll() != null) {
            return HealthCheckResponse.up("Etou pronta para uso!");
        } else {
            return HealthCheckResponse.up("Não estou pronta para uso!");
        }
    }
}
