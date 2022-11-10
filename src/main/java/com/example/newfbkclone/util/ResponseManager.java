package com.example.newfbkclone.util;

import com.example.newfbkclone.pojos.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ResponseManager<T> {

    public ApiResponse<T> success(T data) {
        return new ApiResponse<T>("Request Successful!", true, data);
    }
    public ApiResponse<T> error(String errorMessage) {
        return new ApiResponse<T>(errorMessage, false, null);
    }
}
