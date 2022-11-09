package com.example.newfbkclone.services.serviceImpl;


import com.example.newfbkclone.pojos.ApiResponse;
import com.example.newfbkclone.repositories.UserRepository;
import com.example.newfbkclone.util.ResponseManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl {

    private final UserRepository userRepository;
    private final ResponseManager responseManager;

    public ApiResponse
}
