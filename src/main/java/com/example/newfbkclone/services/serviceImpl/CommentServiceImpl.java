package com.example.newfbkclone.services.serviceImpl;

import com.example.newfbkclone.entities.Comment;
import com.example.newfbkclone.repositories.CommentRepository;
import com.example.newfbkclone.services.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    CommentRepository commentRepository;
    @Override
    public void addComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void updateComment(Comment editedComment) {
        commentRepository.save(editedComment);
    }

    @Override
    public void deleteComment(Long commentId) {
        commentRepository.deleteCommentByCommentId(commentId);
    }
}
