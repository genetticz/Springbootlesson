package com.example.learnspring.springbootrestapitutorial.repository;

import com.example.learnspring.springbootrestapitutorial.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "select * from users ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    List<User> getRandom();
}