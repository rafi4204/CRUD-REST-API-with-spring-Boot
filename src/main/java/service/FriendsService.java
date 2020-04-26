package service;

import model.Friend;
import org.springframework.data.repository.CrudRepository;

public interface FriendsService extends CrudRepository<Friend,Integer> {
}
