package com.example.newfbkclone.repositories;

import com.example.newfbkclone.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByUsername(String username);

    boolean existsByFirstname(String firstname);

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);

    @Query(nativeQuery = true, value = "SELECT * FROM users WHERE firstname LIKE %:question% OR email LIKE %:question%")
    Optional<List<User>> findBySearch(String question);

}
