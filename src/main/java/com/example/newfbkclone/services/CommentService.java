package com.example.newfbkclone.services;


import com.example.newfbkclone.entities.Comment;
import com.example.newfbkclone.pojos.CommentDto;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    void addComment(Comment comment);

    void updateComment(Comment editedComment);

    void deleteComment(Long commentId);

}
