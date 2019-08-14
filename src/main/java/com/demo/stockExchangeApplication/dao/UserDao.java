package com.demo.stockExchangeApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.stockExchangeApplication.model.User;

public interface UserDao extends JpaRepository<User, Integer> {
}
