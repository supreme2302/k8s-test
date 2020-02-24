package com.supreme.kube.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/supreme")
public class SupremeController {

    @Value("${supreme.const}")
    private String configMapConst;

    @GetMapping("/ping")
    public ResponseEntity ping() {
        return ResponseEntity.ok("ping");
    }

    @GetMapping("/const")
    public ResponseEntity configMapTest() {
        return ResponseEntity.ok(configMapConst);
    }
}
