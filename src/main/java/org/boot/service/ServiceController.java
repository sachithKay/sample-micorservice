package org.boot.service;

import org.apache.log4j.Logger;
import org.boot.entities.Person;
import org.boot.mappers.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    private static Logger Log = Logger.getLogger(ServiceController.class);

    @Autowired
    JdbcTemplate jdbc;

    @RequestMapping("/index")
    public String index() {

        Log.info("Request received at index resource");
        return "Welcome";
    }

    @GetMapping("/getdata")
    public Person getData() {

        Log.info("Request received at getdata resource");
        return jdbc.queryForObject("SELECT * FROM Person WHERE id = 1", new PersonMapper());
    }
}