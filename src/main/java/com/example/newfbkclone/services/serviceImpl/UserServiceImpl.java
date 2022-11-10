package com.example.newfbkclone.services.serviceImpl;


import com.example.newfbkclone.pojos.ApiResponse;
import com.example.newfbkclone.pojos.UserDto;
import com.example.newfbkclone.repositories.UserRepository;
import com.example.newfbkclone.util.ResponseManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl {

    private final UserRepository userRepository;
    private final ResponseManager responseManager;

    public ApiResponse createUser(UserDto request) {

        if (request.getFirstname() == null)
            return responseManager.error("Firstname cannot be empty!");
        else if (request.getLastname() == null)
            return responseManager.error("Lastname cannot be empty");
        else if (request.getUsername() == null)
            return responseManager.error("Please enter a Username!");
        else if (request.getPassword() == null)
            return responseManager.error("Password is required!");

        boolean userExist = userRepository.existsByEmail(request.getEmail());
        if(userExist)
            return responseManager.error("Email already exist.\n Login instead");

        User newUser = new User();

    }
}
