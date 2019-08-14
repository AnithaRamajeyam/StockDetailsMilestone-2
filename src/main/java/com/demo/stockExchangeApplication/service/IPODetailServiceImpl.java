package com.demo.stockExchangeApplication.service;

import java.sql.SQLException;
import java.util.List;

import com.demo.stockExchangeApplication.dao.IPODetailDao;
import com.demo.stockExchangeApplication.dao.IPODetailDaoImpl;
import com.demo.stockExchangeApplication.model.IPODetail;

public class IPODetailServiceImpl implements IPODetailService {

	IPODetailDao ipodao;
	@Override
	public int insertIPODetail(IPODetail ipodetail) throws SQLException {
		ipodao = new IPODetailDaoImpl();
		int result=ipodao.insertIPODetail(ipodetail);
		return result;
	}

	@Override
	public List<IPODetail> getAllIPOPLanned() throws Exception {
		ipodao=new IPODetailDaoImpl();
		List<IPODetail> list=ipodao.getAllIPOPLanned();
		return list;
	}

}
