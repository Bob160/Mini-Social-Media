package com.example.newfbkclone.pojos;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class PostDto {

    private Long id;
    private Date createdAt;
    private String post;
    private Date updatedAt;
    private String username;
    private String uuid;

}
