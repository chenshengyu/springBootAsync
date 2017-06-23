package com.example.async.domain.infrastructure.model;

import com.example.async.domain.infrastructure.entity.User;
import com.example.async.domain.infrastructure.model.mapper.UserMapper;
import com.example.async.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author chensy
 * @since 2017/6/23.
 */
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findbyName(String name) {
        return userMapper.findbyName(name);
    }
}
