package com.frigg0.orcquest;

import com.frigg0.orcquest.models.cards.Card;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrcquestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OrcquestApplication.class, args);
    }

    @Override
    public void run(String... args){
        System.out.println("Application started");
    }
}
