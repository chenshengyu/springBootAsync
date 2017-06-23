package com.example.async.domain.repository;

import com.example.async.domain.infrastructure.entity.User;

/**
 * @author chensy
 * @since 2017/6/23.
 */
public interface UserRepository {
    User findbyName(String name);
}
