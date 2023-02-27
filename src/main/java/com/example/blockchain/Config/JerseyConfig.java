package com.example.blockchain.Config;


import com.example.blockchain.Controllers.UtilisateurController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("deprecation")
@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        // suppress server runtime exception
        register(UtilisateurController.class);
    }
}
