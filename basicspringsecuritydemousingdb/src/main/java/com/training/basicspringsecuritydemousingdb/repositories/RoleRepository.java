package com.training.basicspringsecuritydemousingdb.repositories;



import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.basicspringsecuritydemousingdb.entities.ERole;
import com.training.basicspringsecuritydemousingdb.entities.Role;


@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
  Optional<Role> findByName(ERole name);
}