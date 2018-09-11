package com.durgasoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durgasoft.dao.AccountDao;
import com.durgasoft.dto.Account;
@Service("accService")
public class AccountServiceImpl implements AccountService {
	@Autowired(required=true)
	private AccountDao dao;
	@Override
	public String createAccount(String accNo, String accName, String accType, int balance) {
		// TODO Auto-generated method stub
		return dao.create(accNo, accName, accType, balance);
	}

	@Override
	public String searchAccount(String accNo) {
		// TODO Auto-generated method stub
		return dao.search(accNo);
	}

	@Override
	public Account getAccount(String accNo) {
		// TODO Auto-generated method stub
		return dao.getAccount(accNo);
	}

	@Override
	public String updateAccount(String accNo, String accName, String accType, int balance) {
		// TODO Auto-generated method stub
		return dao.update(accNo, accName, accType, balance);
	}

	@Override
	public String deleteAcount(String accNo) {
		// TODO Auto-generated method stub
		return dao.delete(accNo);
	}

}
