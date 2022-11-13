package com.example.newfbkclone.services;

import com.example.newfbkclone.entities.User;
import com.example.newfbkclone.pojos.ApiResponse;
import com.example.newfbkclone.pojos.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User userSignUp(UserDto userDto);

    User userLogin(String email, String password);
//    List<ApiResponse> getAllUsers();
//    UserDto getUser(Long id);



    //void deleteUser(Long id);


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
