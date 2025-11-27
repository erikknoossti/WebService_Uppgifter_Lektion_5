package com.exampl.WebService_Uppgifter_Lektion_5.controller;

import com.exampl.WebService_Uppgifter_Lektion_5.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    private final List<User> users = new ArrayList<>();


    public UserController() {
        users.add(new User(1L, "alice", "secret", true));
        users.add(new User(2L, "bob", "1234", false));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        boolean removed = false;

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User u = iterator.next();
            if (u.id().equals(id)) {
                iterator.remove();
                removed = true;
                break;
            }
        }

        if (removed) {

            return ResponseEntity.ok().build();
        } else {

            return ResponseEntity.status(404).build();
        }
    }
}