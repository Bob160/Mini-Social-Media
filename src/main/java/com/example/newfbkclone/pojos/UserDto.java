package com.example.newfbkclone.pojos;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class UserDto {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String uuid;
    private String createdAt;
    private String updatedAt;


}
