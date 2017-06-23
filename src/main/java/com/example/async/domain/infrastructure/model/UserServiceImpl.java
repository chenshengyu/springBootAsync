package com.example.async.domain.infrastructure.model;

import com.example.async.domain.infrastructure.entity.User;
import com.example.async.domain.repository.UserRepository;
import com.example.async.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chensy
 * @since 2017/6/23.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findbyName(String name) {
        return userRepository.findbyName(name);
    }
}
