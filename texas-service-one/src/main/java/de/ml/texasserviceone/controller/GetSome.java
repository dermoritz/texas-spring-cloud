package de.ml.texasserviceone.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetSome {

    @RequestMapping("/")
    public ResponseEntity<String> get(){
        return ResponseEntity.ok( "Hello World" );
    }

}
