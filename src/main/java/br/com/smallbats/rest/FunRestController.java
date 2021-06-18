package br.com.smallbats.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
//@RequestMapping
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Opa!" + LocalDateTime.now();
    }
}
