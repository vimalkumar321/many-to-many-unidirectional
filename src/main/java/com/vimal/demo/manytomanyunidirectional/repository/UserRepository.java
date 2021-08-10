package com.vimal.demo.manytomanyunidirectional.repository;

import com.vimal.demo.manytomanyunidirectional.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
