package rhtmddnjs.springprc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/users/login")
    public String login(){
        return "users/login";
    }

    @GetMapping("/users/new")
    public String createForm(Model model){
        model.addAttribute("userForm", new UserForm());
        return "users/createUserForm";
    }
}
