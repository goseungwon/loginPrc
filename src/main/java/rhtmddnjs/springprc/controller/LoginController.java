package rhtmddnjs.springprc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/user/create")
    public String goLogin(){
        return "user/create";
    }
}
