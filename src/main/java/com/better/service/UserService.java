package com.better.service;

import com.better.bean.User;

public interface UserService {
	
	public User login(String account, String password);
}
