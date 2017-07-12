package com.example.H2GemfireGradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by anandramani on 12/07/17.
 */
@RestController
public class Controller {

    @Autowired
    private Repository repo;

    @RequestMapping(path = "/")
    public String getById() {
          repo.getById(1234);
          return "";
    }
}
