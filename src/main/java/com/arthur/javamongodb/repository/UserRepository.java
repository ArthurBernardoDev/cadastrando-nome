package com.arthur.javamongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arthur.javamongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
