package com.example.newfbkclone.services;


import com.example.newfbkclone.entities.Post;
import com.example.newfbkclone.entities.User;
import com.example.newfbkclone.pojos.PostDto;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
    void createPost(User user, Post post);

    void updatePost(Post post);

    void deletePost(Post post);


//    PostDto getPostById(Long id);
//
//    PostDto getPostByUuid(String uuid);
//
//    PostDto getPostByUser(String username);
}
