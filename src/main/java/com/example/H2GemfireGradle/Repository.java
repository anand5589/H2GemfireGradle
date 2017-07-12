package com.example.H2GemfireGradle;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * Created by anandramani on 12/07/17.
 */

@Component
public class Repository {

    @Cacheable("Employee")
    public Employee getById(final int id) {
        System.err.print("Called");
        return new Employee();
    }
}
