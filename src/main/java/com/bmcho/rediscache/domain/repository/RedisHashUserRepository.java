package com.bmcho.rediscache.domain.repository;

import com.bmcho.rediscache.domain.entity.RedisHashUser;
import org.springframework.data.repository.CrudRepository;

public interface RedisHashUserRepository extends CrudRepository<RedisHashUser, Long> {
}