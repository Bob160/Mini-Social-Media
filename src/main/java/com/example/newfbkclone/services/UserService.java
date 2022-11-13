package com.example.newfbkclone.services;

import com.example.newfbkclone.entities.User;
import com.example.newfbkclone.pojos.ApiResponse;
import com.example.newfbkclone.pojos.UserDto;

import java.util.List;

public interface UserService {
    User userSignUp(UserDto userSignUpDto);

    User userLogin(String email, String password);
    List<ApiResponse> getAllUsers();
    UserDto getUser(Long id);



    void deleteUser(Long id);


//    ApiResponse createUser(UserDto request);
//
//    ApiResponse findAllUsers();
//
//    ApiResponse findById(Long id);
//
//    ApiResponse findByEmail(String email);
//
//    ApiResponse findBySearch(String question);
}
