package com.amdocs.trainingproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class TrainingprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainingprojectApplication.class, args);
    }

    @GetMapping("/")
    public String mainpage(Model model) {
        model.addAttribute("message", "Welcome to our website!");
        return "index"; // This corresponds to src/main/resources/templates/index.html
    }

    @GetMapping("/contents")
    public String firstfunction(Model model) {
        return "wholelist"; // This corresponds to src/main/resources/templates/lastpage.html
    }
    
    @GetMapping("/lastpage")
    public String lastfunction(Model model) {
    	return "lastpage";
    }
}
