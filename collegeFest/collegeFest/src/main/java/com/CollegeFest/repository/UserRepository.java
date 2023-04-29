package com.CollegeFest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CollegeFest.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsername(String username);
}
