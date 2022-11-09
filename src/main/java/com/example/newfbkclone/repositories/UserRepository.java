package com.example.newfbkclone.repositories;

import com.example.newfbkclone.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUsername(String username);

    boolean existsByFirstname(String firstname);

    boolean existsByEmail(String email);
}
