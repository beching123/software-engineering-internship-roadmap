package com.example.ssh_ch7_ex1.controller;

@Controller
public class MainController {

    @RequestMapping("/home")
    public  String home() {
        return "home.html";
    }
}
