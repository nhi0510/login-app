package com.javat.repositories;

import org.springframework.data.repository.CrudRepository;

import com.javat.models.User;

public interface UserRepository extends CrudRepository<User, String> {

}
