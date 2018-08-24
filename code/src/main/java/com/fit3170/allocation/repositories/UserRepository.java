package com.fit3170.allocation.repositories;

import com.fit3170.allocation.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);
}
