package com.demo.stockExchangeApplication.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.demo.stockExchangeApplication.model.Company;

public interface CompanyService {
	public Company insertCompany(Company company) throws SQLException;
	public boolean updateCompany(Company company);
	public List<Company> getCompanyList() throws Exception;

}
