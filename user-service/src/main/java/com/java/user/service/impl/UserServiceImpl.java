package com.java.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.user.dao.UserDao;
import com.java.user.entity.User;
import com.java.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}
