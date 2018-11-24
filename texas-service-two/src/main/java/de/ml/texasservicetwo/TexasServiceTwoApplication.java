package de.ml.texasservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TexasServiceTwoApplication {

    public static void main( String[] args ) {
        SpringApplication.run( TexasServiceTwoApplication.class, args );
    }
}
