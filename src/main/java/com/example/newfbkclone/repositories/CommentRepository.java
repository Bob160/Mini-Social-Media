package com.example.newfbkclone.repositories;

import com.example.newfbkclone.entities.Comment;
import com.example.newfbkclone.entities.Post;
import com.example.newfbkclone.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    User findCommentByPost(Post post);

    User findCommentByUsername(String username);
}
