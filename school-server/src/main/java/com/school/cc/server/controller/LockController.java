package com.school.cc.server.controller;

import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aofa.wear.common.pojo.CodeEnum;
import com.aofa.wear.common.util.EnumSerializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.school.cc.server.pojo.AppDescription;
import com.school.cc.server.pojo.Status;
@RestController
public class LockController {


	@Autowired
	private AppDescription appDesc;

	@Autowired
	private Status person;
	

	
	GsonBuilder gsonBuilder = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").registerTypeAdapter(CodeEnum.class,
			new EnumSerializer());
	private final Gson gson = gsonBuilder.create();
	private static Logger logger = Logger.getLogger(LockController.class);
	SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");

	
	@RequestMapping("/index")
	public String index(){
		return "index/index";
	}




	
	

	/**
	 * 平台通用应答
	 */
	// @RequestMapping("/notify")
	public Object Notify() {
		return appDesc;
	}

	/**
	 * 注册指静脉
	 */
	@RequestMapping("/fingervein_register")
	public Object Fingervein_register() {
		return appDesc;
	}

	/**
	 * 查询指静脉
	 */
	@RequestMapping("/fingervein_query")
	public Object fingervein_query() {
		return appDesc;
	}


	/**
	 * 禁用，启用 指静脉
	 */
	@RequestMapping("/fingervein_status_set")
	public Object fingervein_status_set() {
		return appDesc;
	}

	/**
	 * 新增nfc
	 */
	@RequestMapping("/nfc_add")
	public Object nfc_add() {
		return appDesc;
	}

	/**
	 * 删除nfc
	 */
	@RequestMapping("/nfc_delete")
	public Object nfc_delete() {
		return appDesc;
	}

	/**
	 * 禁用启用nfc
	 */
	@RequestMapping("/nfc_status_set")
	public Object nfc_status_set() {
		return appDesc;
	}

	/**
	 * 推送指静脉
	 */
	@RequestMapping("/fingervein_data_push")
	public Object fingervein_data_push() {
		return appDesc;
	}

	/**
	 * 远程开锁
	 */
	@RequestMapping("/remote_unlock")
	public Object remote_unlock() {
		return appDesc;
	}

	/**
	 * 能力管理
	 */
	@RequestMapping("/ability_manage")
	public Object ability_manage() {
		return appDesc;
	}

	/**
	 * 参数设置
	 */
	@RequestMapping("/param_set")
	public Object param_set() {
		return appDesc;
	}

	/**
	 * 参数查询
	 */
	@RequestMapping("/param_query")
	public Object param_query() {
		return appDesc;
	}

	/**
	 * 设置蓝牙密码
	 */
	@RequestMapping("/ble_password_set")
	public Object ble_password_set() {
		return appDesc;
	}

	/**
	 * 下发升级包
	 */
	@RequestMapping("/soft_package")
	public Object soft_package() {
		return appDesc;
	}

}
