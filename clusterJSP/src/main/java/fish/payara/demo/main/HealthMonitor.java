package fish.payara.demo.main;

import jakarta.ejb.Schedule;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

import java.util.logging.Logger;

@Singleton
@Startup
public class HealthMonitor {

    private static final Logger LOGGER = Logger.getLogger(HealthMonitor.class.getName());

    static {
        LOGGER.info("ClusterJSP loaded");
    }

    @Schedule(hour = "*", minute = "*/2", persistent = false)
    public void monitorHealth() {
        LOGGER.info("ClusterJSP running");
    }
}
