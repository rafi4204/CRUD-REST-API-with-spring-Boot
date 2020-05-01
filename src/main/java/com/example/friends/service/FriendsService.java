package com.example.friends.service;

import com.example.friends.model.Friend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface FriendsService extends CrudRepository<Friend,Integer> {
}
