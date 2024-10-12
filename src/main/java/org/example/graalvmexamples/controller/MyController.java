package org.example.graalvmexamples.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/")
public class MyController {

    @GetMapping("index")
    public Map<String, Object> index() {
        return Map.of("message", "Hello World");
    }
}
