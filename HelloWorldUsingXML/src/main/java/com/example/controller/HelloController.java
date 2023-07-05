package com.example.controller;

import com.example.model.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/helloworld")
    public String helloWorld(Model model)
    {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World");
        model.addAttribute("helloWorld",helloWorld);
        return "home";

    }
}
