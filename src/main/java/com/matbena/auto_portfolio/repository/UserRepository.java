package com.matbena.auto_portfolio.repository;

import com.matbena.auto_portfolio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
