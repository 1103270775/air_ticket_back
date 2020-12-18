package com.ctgu.airticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirTicketApplication {

    public static void main(String[] args) {

        SpringApplication.run(AirTicketApplication.class, args);
        System.out.println("http://localhost:8181/user/findAll/0/10");
        System.out.println("http://localhost:8181/ticketorder/findAll/0/10");
        System.out.println("http://localhost:8181/user/findById/1");
        System.out.println("http://localhost:8181/ticketorder/findById/11");
        System.out.println("http://localhost:8181/ticketorder/deleteById/23");
        System.out.println("http://localhost:8181/orderdetail/findAll/0/1");

        System.out.println("http://localhost:8181/manager/findAll/0/3");
        System.out.println("http://localhost:8181/manager/findById/1");
    }

}
