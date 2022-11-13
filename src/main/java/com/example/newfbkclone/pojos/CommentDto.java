package com.example.newfbkclone.pojos;

import lombok.Data;
import lombok.Getter;

import java.util.Date;

@Data
@Getter
public class CommentDto {
    private Long id;
    private String comment;
    private Date createdAt;
    private Date updatedAt;
    private String postId;
    private String uuid;

}
