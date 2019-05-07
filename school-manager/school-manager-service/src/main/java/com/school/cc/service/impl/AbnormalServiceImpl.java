package com.school.cc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.cc.mapper.AbnormalMapper;
import com.school.cc.service.inter.AbnormalService;
import com.school.cc.pojo.Abnormal;

@Service
public class AbnormalServiceImpl implements AbnormalService {
	@Autowired
	private AbnormalMapper abnormalMapper;

	@Override
	public boolean insert(Abnormal abnormal) {
		boolean flg = abnormalMapper.insertSelective(abnormal) > 0 ? true : false;
		return flg;
	}

}
