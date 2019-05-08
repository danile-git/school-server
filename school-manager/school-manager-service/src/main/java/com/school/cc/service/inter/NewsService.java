package com.school.cc.service.inter;

import java.util.List;

import com.school.cc.pojo.News;

public interface NewsService {
	boolean insert(News news);
	List<News> selectByPage(News news);
}
