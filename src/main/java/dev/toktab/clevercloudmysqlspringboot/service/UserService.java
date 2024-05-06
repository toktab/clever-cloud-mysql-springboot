package dev.toktab.clevercloudmysqlspringboot.service;

import dev.toktab.clevercloudmysqlspringboot.model.User;
import dev.toktab.clevercloudmysqlspringboot.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
