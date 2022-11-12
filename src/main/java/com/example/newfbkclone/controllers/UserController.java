package com.example.newfbkclone.controllers;


import com.example.newfbkclone.pojos.ApiResponse;
import com.example.newfbkclone.pojos.UserDto;
import com.example.newfbkclone.services.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

   // private final UserService userService;

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

    @GetMapping("/login-page")
    public String getLoginPage(Model model){
        model.addAttribute("pageTitle","Login Page");
        return "login";

    }

}
