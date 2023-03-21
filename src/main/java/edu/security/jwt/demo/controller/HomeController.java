package edu.security.jwt.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * {DESCRIPTION}
 *
 * @author Frank Sprich
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> home(Principal principal) {
        return ResponseEntity.ok("Hello, " + principal.getName());
    }

}
