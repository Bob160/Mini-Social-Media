package com.example.newfbkclone.repositories;

import com.example.newfbkclone.entities.Comment;
import com.example.newfbkclone.entities.Post;
import com.example.newfbkclone.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {



    List<Comment> findCommentByPost(Post post);

    Comment findCommentByCommentId(Long CommentId);

    List<Comment> findCommentByUsername(String username);

    void deleteCommentByCommentId(Long commentId);
    void deleteAllByPost (Post post);
}
