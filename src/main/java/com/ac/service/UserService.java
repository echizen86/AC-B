package com.ac.service;

import com.ac.model.User;

public interface UserService {

	public User findUserByEmail(String email);

	public void saveUser(User user);
}