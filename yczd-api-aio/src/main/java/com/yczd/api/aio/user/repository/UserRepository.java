package com.yczd.api.aio.user.repository;

import java.util.List;

import com.yczd.api.aio.user.domain.User;

/**
 * 用户数据库操作接口类
 * @author yczd
 *
 */
public interface UserRepository {
	public List<User> findAll();

	public User findById(String id);

	public User findByName(String userName);

	public Integer insert(User user);

	public Integer update(User user);

	public void deleteById(String id);

	public void delete(User user);
}
