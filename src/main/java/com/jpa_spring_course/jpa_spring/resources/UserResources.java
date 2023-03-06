package com.jpa_spring_course.jpa_spring.resources;

import com.jpa_spring_course.jpa_spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L,"Adonis","adonis@email.com","999998888","54321");
        return ResponseEntity.ok().body(u);
    }

}
