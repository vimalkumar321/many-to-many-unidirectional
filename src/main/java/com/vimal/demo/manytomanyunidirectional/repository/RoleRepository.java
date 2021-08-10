package com.vimal.demo.manytomanyunidirectional.repository;

import com.vimal.demo.manytomanyunidirectional.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {
    Optional<Role> findByName(String name);
}
