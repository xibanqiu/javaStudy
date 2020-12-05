package com.atguigu.service;

import com.atguigu.dao.BookDao;
import com.atguigu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private BookDao bookDao;

	@Transactional(noRollbackForClassName="java.lang.ArithmeticException")
	public void multiUpdate() {
		userDao.updateUser();
	    int i =	2/0 ;
		bookDao.updateBook();
	}
	
}