package dev.java10x.user.service;

import dev.java10x.user.domain.UserModel;
import dev.java10x.user.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserModel saveUser(UserModel userModel){
        return userModel = userRepository.save(userModel);
    }
}
