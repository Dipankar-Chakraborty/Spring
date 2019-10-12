package com.zensar.services;

import org.springframework.stereotype.Service;

import com.zensar.entities.User;
@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean validateUser(User user) {
		// TODO Auto-generated method stub
		if(user.getUsername().equals("Dipankar") && user.getPassword().equals("welcome")) {
			return true;
		}
		else {
		return false;
		}
	}

}
