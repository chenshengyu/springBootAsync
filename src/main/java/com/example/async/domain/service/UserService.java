package com.example.async.domain.service;

import com.example.async.domain.infrastructure.entity.User;

/**
 * @author chensy
 * @since 2017/6/23.
 */
public interface UserService {
    User findbyName(String name);
}
