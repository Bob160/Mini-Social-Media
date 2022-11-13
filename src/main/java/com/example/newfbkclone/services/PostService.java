package com.example.newfbkclone.services;


import com.example.newfbkclone.entities.Post;
import com.example.newfbkclone.pojos.PostDto;
import org.springframework.stereotype.Service;

@Service
public interface PostService {
    Post createPost(PostDto createPostDto);

    Post deletePost(PostDto deletePostDto);


//    PostDto getPostById(Long id);
//
//    PostDto getPostByUuid(String uuid);
//
//    PostDto getPostByUser(String username);
}
