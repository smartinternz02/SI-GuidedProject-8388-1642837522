package com.selva.springexpensetracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selva.springexpensetracker.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findFirstByUsername(String username);
}
