package me.shota.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import me.shota.bean.User;

public interface UserDao {
	public List<User> getAllUserList(Map<String, Object> map);
}
