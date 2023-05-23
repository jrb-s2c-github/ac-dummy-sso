package za.co.s2c.ac.cryppproxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.net.ssl.HttpsURLConnection;

@SpringBootApplication
@Configuration
public class DummySSOApplication {
    @Autowired
    private static Environment environment;

    public static void main(String[] args) {
        if (args.length == 1 && args[0].equals ("dev")) {
            // logging starts before spring profile has been set so cannot bypass host verification based on spring profile
            HttpsURLConnection.setDefaultHostnameVerifier((hostname, session) -> true);
        }
        SpringApplication.run(DummySSOApplication.class, args);
    }
}
