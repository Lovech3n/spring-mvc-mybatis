package me.shota.service;

import java.util.List;
import java.util.Map;

import me.shota.bean.User;

public interface UserService {
	public List<User> getAllUserList(Map<String, Object> map);
}
