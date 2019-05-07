package com.school.cc.server.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class TaskThreadPool {
	/**
	 * 创建一个可缓存的线程池。如果线程池的大小超过了处理任务所需要的线程，那么就会回收部分空闲（60秒不执行任务）的线程
	 * */
	private ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
	private static Logger logger = Logger.getLogger(TaskThreadPool.class);

	/**
	 * 任务执行
	 * */
	public void execute(Runnable task) {
		try {
			cachedThreadPool.execute(task);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("提交任务错误:" + e.getMessage());

		}

	}

	/**
	 * 关闭
	 * ***/
	public void shutdown() {
		try {
			cachedThreadPool.shutdown();
		} catch (Exception e) {
			logger.error("关闭任务错误:" + e.getMessage());
		}

	}
}
