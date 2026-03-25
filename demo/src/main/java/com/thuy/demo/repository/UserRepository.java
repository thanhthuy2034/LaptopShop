package com.thuy.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.thuy.demo.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    User save(User hoidanit);
}
