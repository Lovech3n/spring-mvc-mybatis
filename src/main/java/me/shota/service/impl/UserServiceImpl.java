package me.shota.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.shota.bean.User;
import me.shota.dao.UserDao;
import me.shota.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;
	
	@Override
	public List<User> getAllUserList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userDao.getAllUserList(map);
	}

}
