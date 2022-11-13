package com.example.newfbkclone.repositories;

import com.example.newfbkclone.entities.Post;
import com.example.newfbkclone.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    User findPostByUsername(String username);

}
