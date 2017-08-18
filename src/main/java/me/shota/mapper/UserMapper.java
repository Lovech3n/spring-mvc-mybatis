package me.shota.mapper;

import java.util.List;
import java.util.Map;
import me.shota.bean.User;

public interface UserMapper {
	public List<User> getAllUserList(Map<String, Object> map);
}
