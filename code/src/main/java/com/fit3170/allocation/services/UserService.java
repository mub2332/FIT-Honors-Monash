package com.fit3170.allocation.services;

import com.fit3170.allocation.models.User;

public interface UserService {

    public User findByEmail(String email);
}
