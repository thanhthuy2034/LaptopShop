package com.thuy.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thuy.demo.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User save(User eric);

    List<User> findByEmail(String email);
    List<User> findAll();
    User findById(long id);
}
