package ru.org.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.org.spring.model.User;
import ru.org.spring.services.UserDetailsServiceImpl;


@Controller
@RequestMapping
public class UserController {

    @GetMapping("/admin")
    public String getIndex() {
        return "pages/index";
    }

    private UserDetailsServiceImpl userService;

    public UserController(UserDetailsServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("user/{name}")
    public String One(@PathVariable("name") String name, Model model) {
        User user = userService.findByName(name);
        model.addAttribute("user", user);
        return "pages/user.html";

    }

}
