package com.demo.stockExchangeApplication.dao;

import java.util.List;

import com.demo.stockExchangeApplication.model.IPODetail;


public interface IPODetailDao {

	public int insertIPODetail(IPODetail ipodetail);

	public List<IPODetail> getAllIPOPLanned();

}
