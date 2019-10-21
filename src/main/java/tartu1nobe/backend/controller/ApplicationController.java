package tartu1nobe.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
public class ApplicationController {
    @RequestMapping("/")
    public String index() {
        return "Message from Spring Boot backend by team Tartu1!";
    }

    @RequestMapping("/car/nob001")
    public String car() {
        return "Battery percentage: 90%";
    }
}
