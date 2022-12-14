package com.example.newfbkclone.controllers;


import com.example.newfbkclone.entities.User;
import com.example.newfbkclone.pojos.ApiResponse;
import com.example.newfbkclone.pojos.UserDto;
import com.example.newfbkclone.services.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
@Component
//@AllArgsConstructor
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;


//    @PostMapping("/signup")
//    public ApiResponse createUser(@RequestBody UserDto request) {
//        return userService.createUser(request);
//    }
//
//    @GetMapping("/list")
//    public ApiResponse findAllUsers() {
//        return userService.findAllUsers();
//    }
//
//    @GetMapping("/{id}")
//    public ApiResponse findUserById(@PathVariable Long id) {
//        return userService.findById(id);
//    }
//
//    @GetMapping("/get_by_email")
//    public ApiResponse findUserByEmail(@RequestParam("email") String email) {
//        return userService.findByEmail(email);
//    }
//
//    @GetMapping("/search")
//    public ApiResponse findUserBySearch(@RequestParam("q") String question) {
//        return userService.findBySearch(question);
//    }



    //Index / Home Page
    @GetMapping("/index")
    public String home() {
        return "index";
    }


    //Landing Page
    @GetMapping("/landing")
    public String landing() {
        return "landing";
    }

    //Login Page
    @GetMapping("/login-page")
    public String getLoginPage(Model model){
        model.addAttribute("pageTitle","Login Page");
        return "login";
    }

    @PostMapping("/login-page")
    public String getLoginPage(User user) {
        User authUser = userService.userLogin(user.getEmail(), user.getPassword());

        if (Objects.nonNull(authUser)) {
            return "redirect:/landing";
        } else {
            return "redirect:/login-page";
        }
    }


    //Sign Up
    @GetMapping("/sign-up")
    public String getSignUp(Model model) {
        model.addAttribute("pageTitle", "Signup Page");
        return "signup";
    }


    @PostMapping("/sign-up")
    public String getSignUp(UserDto user, Model model) {
        model.addAttribute("user", user);
        User toSaveUser = userService.userSignUp(user);
        User authUser = userService.userLogin(user.getEmail(), user.getPassword());

        if(Objects.nonNull(authUser)) {
            return "redirect:/login";
        } else {
            return "redirect:/sign-up";
        }
    }

}
