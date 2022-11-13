package com.example.newfbkclone.pojos;


import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Data
@Getter
public class PostDto {

    private Long id;
    private Date createdAt;
    private String post;
    private Date updatedAt;
    private String username;
    private String uuid;

}
