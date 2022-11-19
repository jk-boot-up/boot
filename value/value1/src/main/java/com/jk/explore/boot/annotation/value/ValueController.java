package com.jk.explore.boot.annotation.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@PropertySource("classpath:value1.properties")
public class ValueController {

    @Value("${welcome.message:Default- welcome to Value annotation}")
    private String welcomeMessage;

    @GetMapping("welcome")
    public String welcome() {
        return welcomeMessage;
    }
}
