package com.school.cc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.cc.mapper.NewsMapper;
import com.school.cc.pojo.News;
import com.school.cc.service.inter.NewsService;

@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsMapper newsMapper;

	@Override
	public boolean insert(News news) {
		boolean flg = newsMapper.insertSelective(news) > 0 ? true : false;
		return flg;
	}

	@Override
	public List<News> selectByPage(News news) {
		return newsMapper.selectByPage(news);
	}

	

}
