package za.co.s2c.ac.cryppproxy.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
public class SignonController {
    private static final Logger logger = LogManager.getLogger(SignonController.class);

    @GetMapping("/getSession/{email}")
    public Boolean signon(@PathVariable String email, @RequestParam String password) {
        logger.info("Signing on with username: " + email);

        logger.info("Sign on was successful");
        return true;
    }

    @PostMapping("/register/{id}")
    public Boolean register(@PathVariable String id) {
        logger.info("Registering user with id: " + id);

        logger.info("User with id " + id + " has been registered");
        return true;
    }
}
