package br.com.zando.testezando.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {

        @GetMapping("/")
        public String healthCheck() {
            return "HEALTH CHECK OK!";
        }
}
