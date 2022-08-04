package rhtmddnjs.springprc.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import rhtmddnjs.springprc.domain.User;
import rhtmddnjs.springprc.service.UserService;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users/login")
    public String login(){
        return "users/login";
    }

    @GetMapping("/users/new")
    public String createForm(Model model){
        model.addAttribute("userForm", new UserForm());
        return "users/createUserForm";
    }

    @PostMapping("/users/new")
    public String create(@Valid UserForm form, BindingResult result){

        if (result.hasErrors()){
            return "users/createUserForm";
        }

        User user = new User();
        user.setName(form.getName());
        user.setPassword(form.getPassword());
        user.setPhoneNumber(form.getPhoneNum());

        userService.join(user);
        return "redirect:/users/login";
    }
}
