package com.school.cc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.cc.mapper.UserMapper;
import com.school.cc.pojo.User;
import com.school.cc.service.inter.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectByWxcode(User user) {
		List<User> userList = userMapper.selectByWxcode(user);
		return userList == null ? new ArrayList<User>() : userList;
	}

}
