package com.daybook.controller;

import com.daybook.data.model.User;
import com.daybook.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path="/users")
public class UserController {

    private UserRepository userRepository;

    @Autowired
    UserController (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<User> post(@Valid @RequestBody User user) {
        userRepository.save(user);

        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping
    public @ResponseBody Iterable<User> all() {
        return userRepository.findAll();
    }

    @GetMapping(path="/{id}")
    public ResponseEntity<User> get(@PathVariable Long id) {
        User user = userRepository.findOne(id);
        if (null == user) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
