package com.daybook.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.daybook.data.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
