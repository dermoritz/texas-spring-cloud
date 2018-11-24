package de.ml.texasserviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TexasServiceOneApplication {

    public static void main( String[] args ) {
        SpringApplication.run( TexasServiceOneApplication.class, args );
    }
}
