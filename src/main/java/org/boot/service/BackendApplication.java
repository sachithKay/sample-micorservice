package org.boot.service;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BackendApplication {
    private static Logger Log = Logger.getLogger(BackendApplication.class);

    public static void main(String[] args) {
        Log.info("Starting backend-service.... ");
        SpringApplication.run(BackendApplication.class, args);
    }

}
