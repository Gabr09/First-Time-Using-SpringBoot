package com.myproject.projectcourse.resources;

import com.myproject.projectcourse.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Gabrielzinho", "gabrielzinho@gmail.com", "1190929382", "1234");
        return ResponseEntity.ok().body(u);
    }
}
