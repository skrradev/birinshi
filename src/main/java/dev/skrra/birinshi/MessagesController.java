package dev.skrra.birinshi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagesController {


    @GetMapping("/user/")
    public String getUsers() {

        return "screw!";
    }

}
