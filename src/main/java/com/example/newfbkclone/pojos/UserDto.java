package com.example.newfbkclone.pojos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
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
