package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.owu.entity.User;
import ua.com.owu.service.UserService;

import java.security.Principal;

@Controller
public class MainController {

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String index(){
        return "index";
    }


    @PostMapping("/save")
    public String save(@RequestParam("username") String username,
                       @RequestParam("password") String password,
                       @RequestParam("email") String email){
        userService.save(new User(username,password,email));
        return "redirect:/";
    }

    @GetMapping("/adm")
    public String adm(Principal principal, Model model){
        model.addAttribute("user",principal);
        return "admin";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }


}
