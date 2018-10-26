package com.userapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.userapi.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
