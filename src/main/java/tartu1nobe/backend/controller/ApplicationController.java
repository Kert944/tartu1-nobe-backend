package tartu1nobe.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ApplicationController {
    @RequestMapping("/")
    public String index() {
        return "Message from Spring Boot backend by team Tartu1!";
    }
}
