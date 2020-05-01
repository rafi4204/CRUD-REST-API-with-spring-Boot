package com.example.friends.controller;


import com.example.friends.model.Friend;

import com.example.friends.service.FriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class FriendsController {
    @Autowired
    FriendsService friendsService;

    @PostMapping("/friend")
    Friend save(@RequestBody Friend friend) {
        return friendsService.save(friend);
    }

    @GetMapping("/friend")
    Iterable<Friend> show() {
        return friendsService.findAll();
    }

    @PutMapping("/friend")
    Friend update(@RequestBody Friend friend) {
        return friendsService.save(friend);
    }

    @DeleteMapping("/friend")
    void delete(@RequestBody Friend friend) {
        friendsService.delete(friend);
    }


}
