package com.example.newfbkclone.services;

import com.example.newfbkclone.entities.User;
import com.example.newfbkclone.pojos.ApiResponse;
import com.example.newfbkclone.pojos.UserDto;

import java.util.List;

public interface UserService {
    User userSignUp(UserDto userSignUpDto);
    List<ApiResponse> getAllUsers();
    UserDto getUser(Long id);



    void deleteUser(Long id);


}
