package com.kgisl.springMVCBasics.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    
    @RequestMapping("/show")
    public String getShowPage(Model model){
        // String name = "BloodySweet";
        // model.addAttribute("namePrint", name);
        return "view-page";
    }

    @RequestMapping("/processMovieBook")
    public String processPage(HttpServletRequest req,Model model){
          String name =  req.getParameter("movieName");
            
          model.addAttribute("Moviename", name);

        return "result-page";
    }
}
