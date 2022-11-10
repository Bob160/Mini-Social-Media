package com.example.newfbkclone.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse<T> {
private String message;
private boolean success;
private T data;
}
