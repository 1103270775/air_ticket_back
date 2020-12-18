package com.ctgu.airticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirTicketApplication {

    public static void main(String[] args) {

        SpringApplication.run(AirTicketApplication.class, args);
        System.out.println("http://localhost:8181/tuser/findAll/0/10");
        System.out.println("http://localhost:8181/tuser/findById/1");

    }

}
