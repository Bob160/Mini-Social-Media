package com.example.newfbkclone.services.serviceImpl;


import com.example.newfbkclone.entities.User;
import com.example.newfbkclone.exception.NameAlreadyExistException;
import com.example.newfbkclone.exception.NameCannotBeEmptyException;
import com.example.newfbkclone.pojos.UserDto;
import com.example.newfbkclone.repositories.UserRepository;
import com.example.newfbkclone.util.ResponseManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserServiceImpl {

    private final UserRepository userRepository;
    private final ResponseManager responseManager;


    public User signUp(UserDto userDto) {
        User newUser = new User();
        if (newUser.getFirstname() == null)
            throw new NameCannotBeEmptyException("Firstname cannot be empty!");
        else if (newUser.getLastname() == null)
            throw new NameCannotBeEmptyException("Lastname cannot be empty!");
        else if (newUser.getUsername() == null)
            throw new NameCannotBeEmptyException("Please enter a Username!");
        else if (newUser.getPassword() == null)
            throw new NameCannotBeEmptyException("Password is required");
        else if (newUser.getEmail() == null)
            throw new NameCannotBeEmptyException("Please enter an Email");

        boolean userExist = userRepository.existsByEmail(newUser.getEmail());
        if(userExist)
            throw new NameAlreadyExistException("Email already exist.\n Login instead");

        newUser.setFirstname(userDto.getFirstname());
        newUser.setLastname(userDto.getLastname());
        newUser.setUsername(userDto.getUsername());
        newUser.setPassword(userDto.getPassword());
        newUser.setEmail(userDto.getEmail());
        newUser.setUuid(UUID.randomUUID().toString());
        newUser.setCreatedAt(new Date());
        newUser.setUpdatedAt(new Date());

        User savedUser = userRepository.save(newUser);
        return savedUser;
    }

//    public ApiResponse createUser(UserDto request) {
//
//        if (request.getFirstname() == null)
//            return responseManager.error("Firstname cannot be empty!");
//        else if (request.getLastname() == null)
//            return responseManager.error("Lastname cannot be empty");
//        else if (request.getUsername() == null)
//            return responseManager.error("Please enter a Username!");
//        else if (request.getPassword() == null)
//            return responseManager.error("Password is required!");
//
//        boolean userExist = userRepository.existsByEmail(request.getEmail());
//        if(userExist)
//            return responseManager.error("Email already exist.\n Login instead");
//
//        User newUser = new User();
//        newUser.setFirstname(request.getFirstname());
//        newUser.setLastname(request.getLastname());
//        newUser.setUsername(request.getUsername());
//        newUser.setPassword(request.getPassword());
//        newUser.setUuid(UUID.randomUUID().toString());
//        newUser.setCreatedAt(new Date());
//        newUser.setUpdatedAt(new Date());
//
//        User savedUser = userRepository.save(newUser);
//        return responseManager.success(savedUser);
//    }

//    public ApiResponse findAllUsers() {
//        List<User> userList = userRepository.findAll();
//        if(!userList.isEmpty())
//            return responseManager.success(userList);
//
//        return responseManager.error("No user available");
//    }
//
//    public ApiResponse findById(Long id) {
//        User user = userRepository.findById(id).orElse(null);
//        if(user!=null)
//            return responseManager.success(user);
//        return responseManager.error("User does not exist");
//    }
//
//    public ApiResponse findByEmail(String email) {
//        User user = userRepository.findByEmail(email).orElse(null);
//        if(user!=null)
//          return responseManager.success(user);
//
//        return responseManager.error("User does not exist");
//    }
//
//    public ApiResponse findBySearch(String question) {
//        List<User> userList = userRepository.findBySearch(question).orElse(null);
//        if(!userList.isEmpty())
//            return responseManager.success(userList);
//
//        return responseManager.error("User does not exist");
//    }
}
