package com.soulcraft.demo.errorhandling.demo1.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Hello controller
 * </p>
 *
 * @author Scott
 * @since 20220411
 */
@RestController
@Tag(name = "Hello")
@RequestMapping("/hello")
public class HelloController {

    @Operation(summary = "Greetings")
    @GetMapping(value = "/greeting")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}

