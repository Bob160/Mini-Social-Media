package com.example.newfbkclone.pojos;

import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Data
@Getter
public class UserDto {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String email;
    private String uuid;
    private Date createdAt;
    private Date updatedAt;


}
