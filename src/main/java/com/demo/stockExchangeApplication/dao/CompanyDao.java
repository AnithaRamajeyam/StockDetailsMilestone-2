package com.demo.stockExchangeApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.stockExchangeApplication.model.Company;

public interface CompanyDao extends JpaRepository<Company, Integer> {
	
}
