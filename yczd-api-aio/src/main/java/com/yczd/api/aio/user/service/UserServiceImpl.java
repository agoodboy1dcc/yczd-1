package com.yczd.api.aio.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yczd.api.aio.user.domain.User;
import com.yczd.api.aio.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findById(String id) {
		return userRepository.findById(id);
	}

	@Override
	public User findByName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	public User save(User user) {
		Integer result;
		if (user.getUserId() == null) {
			 result = userRepository.insert(user);
		} else {
			result=userRepository.update(user);
		}
		return user;
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);

	}

	@Override
	public void deleteById(String id) {

	}

}
