package com.fit3171.allocation.repositories;

import com.fit3171.allocation.models.Supervisor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SupervisorRepository extends MongoRepository<Supervisor, String> {
}
