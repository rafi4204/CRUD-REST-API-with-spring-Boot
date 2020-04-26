package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import service.FriendsService;

@RestController
public class FriendsController {
    @Autowired
    FriendsService friendsService;


}
