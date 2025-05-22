package com.bmcho.rediscache.domain.repository;

import com.bmcho.rediscache.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
