package de.ml.texaseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TexasEurekaApplication {

    public static void main( String[] args ) {
        SpringApplication.run( TexasEurekaApplication.class, args );
    }
}
