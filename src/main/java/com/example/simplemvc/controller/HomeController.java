package com.example.simplemvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("welcomes")
public class HomeController {

    @RequestMapping("homes")
    public String myHome(){
        return "welcome";
    }
}
