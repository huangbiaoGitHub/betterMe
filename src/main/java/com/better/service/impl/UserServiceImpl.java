package com.better.service.impl;

import org.springframework.stereotype.Service;

import com.better.bean.User;
import com.better.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	public User login(String account, String password) {
		User user = new User();
		
		return user;
	}

}
