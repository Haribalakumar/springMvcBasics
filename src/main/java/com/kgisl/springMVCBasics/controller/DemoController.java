package com.kgisl.springMVCBasics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/demo")
public class DemoController {
    

    @RequestMapping("/login")
    public String LoginPage(){
        return "login-page";
    }

    @RequestMapping("/logindetails")
    public String getloginDetails(@RequestParam String username, @RequestParam String password,Model model){
        model.addAttribute("pass", password);
        model.addAttribute("user", username);
        System.out.println(username + " " + password);
        return "details";
    }

    @RequestMapping("/register")
    public String getRegisterPage(){
        return "register-form";
    }
    
    // @GetMapping("/send")
    // public String getRegisterShowPage(){
    //     return "register-show";
    // }

    @GetMapping("/send")
public String registerUser(@RequestParam String name, @RequestParam int age, @RequestParam String gender,
        @RequestParam String location, @RequestParam String email, @RequestParam String password,
        @RequestParam String phonenumber , Model model) {

            model.addAttribute("name", name);
            model.addAttribute("age", age);
            model.addAttribute("gender", gender);
            model.addAttribute("location", location);
            model.addAttribute("email", email);
            model.addAttribute("password", password);
            model.addAttribute("phonenumber", phonenumber);

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Gender: " + gender);
    System.out.println("Location: " + location);
    System.out.println("Email: " + email);
    System.out.println("Password: " + password);
    System.out.println("Phone Number: " + phonenumber);

    return "register-show";
}

}
