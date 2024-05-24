package com.example.todoJava.files;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHello {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, World!";
    }

    @RequestMapping("/hello-html")
    public String sayHelloHtml() {
        return "sayHello";
    }
}
