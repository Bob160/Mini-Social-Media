package com.example.newfbkclone.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse<T> {
private String firstname;
private String lastname;
private String username;
private String createdAt;
private String updateAt;
}
