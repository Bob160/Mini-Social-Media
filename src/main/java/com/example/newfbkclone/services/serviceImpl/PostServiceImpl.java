package com.example.newfbkclone.services.serviceImpl;

import com.example.newfbkclone.entities.Post;
import com.example.newfbkclone.entities.User;
import com.example.newfbkclone.pojos.PostDto;
import com.example.newfbkclone.repositories.CommentRepository;
import com.example.newfbkclone.repositories.PostRepository;
import com.example.newfbkclone.services.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    PostRepository postRepository;
    //CommentRepository commentRepository;
    @Override
    public void createPost(User user, Post post) {

        post.setUser(user);
        postRepository.save(post);
    }

    @Override
    public void updatePost(Post post) {
        postRepository.save(post);
    }

    @Override
    public void deletePost(Post post) {
        postRepository.delete(post);
    }
}
