package com.example.newfbkclone.repositories;

import com.example.newfbkclone.entities.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Likes, Long> {
}
