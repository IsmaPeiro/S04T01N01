package cat.itacademy.s04.t01.n01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    
    @GetMapping("HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOW") String name) {
        return "Hello, " + name + ". You're running a Maven project";
    }
    
    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String saluda2(@PathVariable(required = false) String name) {
        if (name != null) {
            return "Hello, " + name + ". You're running a Maven project";
        } else {
            return "Hello, you're running a Maven project";
        }
    }
}