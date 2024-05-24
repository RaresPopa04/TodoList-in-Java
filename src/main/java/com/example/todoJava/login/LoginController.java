package com.example.todoJava.login;

import org.springframework.boot.autoconfigure.flyway.FlywayProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final AuthService authService;
    public LoginController(AuthService authService) {
        this.authService = authService;
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String goToLogin() {
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name, ModelMap model) {
        if(!authService.auth(name, name)){
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
        model.put("name", name);
        return "welcome";
    }
}
