package com.school.cc.service.inter;

import java.util.List;

import com.school.cc.pojo.User;

public interface UserService {
	List<User> selectByWxcode(User user);
}
