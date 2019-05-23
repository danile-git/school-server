package com.school.cc.server.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.aofa.wear.common.pojo.CodeEnum;
import com.aofa.wear.common.util.EnumSerializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.school.cc.pojo.News;
import com.school.cc.pojo.User;
import com.school.cc.server.pojo.AppDescription;
import com.school.cc.server.pojo.Status;
import com.school.cc.server.util.WebUtil;
import com.school.cc.service.inter.NewsService;
import com.school.cc.service.inter.UserService;
//import com.tls.tls_sigature.tls_sigature;
//import com.tls.tls_sigature.tls_sigature.GenTLSSignatureResult;
@RestController
public class SchoolController {


	@Autowired
	private AppDescription appDesc;

	@Autowired
	private Status person;
	
	@Autowired
	private NewsService newsService;
	@Autowired
	private UserService userService;

	
	GsonBuilder gsonBuilder = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").registerTypeAdapter(CodeEnum.class,
			new EnumSerializer());
	private final Gson gson = gsonBuilder.create();
	private static Logger logger = Logger.getLogger(SchoolController.class);
	SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");

	
	@RequestMapping("/index")
	public String index(){
		return "index/index";
	}



	@RequestMapping("/news")
	public Object news(@RequestParam(value="i", defaultValue="0")Integer index,@RequestParam(value="c", defaultValue="5")Integer count){
		
		News news=new News();
		news.setCount(count);
		news.setIndex(index);
		//return newsService.
		return gson.toJson(newsService.selectByPage(news));
	}
	
	@RequestMapping("/order")
	public Object appointment(String wxcode,@RequestParam(value="type", defaultValue="1")Integer type){
		User user=new User();
		user.setWxCode(wxcode);
		user.setCtype(type);
		return gson.toJson(userService.selectByWxcode(user));
	}
	@RequestMapping("/user")
	public Object appointment(String wxcode){
		//User user=new User();
		//user.setWxCode(wxcode);

		return gson.toJson(userService.selectUserByWxcode(wxcode));
	}
	//  public String uploadHeadImage(HttpServletRequest request, @RequestParam(value = "imgFile" , required=false) MultipartFile multipartFile)
	@RequestMapping("/uploadImage")
    public String uploadHeadImage(HttpServletRequest request) {
		try {
			
			//ResourceUtils
			String staticRoot="/static";
			   String headBase="/upload/head";
		       String path =String.format("%s%s%s", ResourceUtils.getURL("classpath:").getPath(),staticRoot,headBase);
		       
		        //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
		        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
		                request.getSession().getServletContext());
		       // result.put("status","success");
		        //检查form中是否有enctype="multipart/form-data"
		        if(multipartResolver.isMultipart(request))
		        {
		            //将request变成多部分request
		            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
		            //获取multiRequest 中所有的文件名
		            Iterator iter=multiRequest.getFileNames();
		            
		            File saveFile=new File(path);
		            if(!saveFile.exists()){
		                saveFile.mkdirs();
		            }
		            while(iter.hasNext())
		            {
		                //一次遍历所有文件
		                MultipartFile multipartFile=multiRequest.getFile(iter.next().toString());
		                if(multipartFile!=null)
		                {
		                    String filename = multipartFile.getOriginalFilename();
		                    //获取后缀
		                    String prefix=filename.substring(filename.lastIndexOf(".")+1);
		                    String uuid = UUID.randomUUID().toString().replaceAll("-","");
		                    String realPath=String.format("%s/%s.%s",headBase, uuid,prefix);
		                    String toPath=String.format("%s\\%s.%s",saveFile,uuid,prefix);
		                    //上传
		                    try {
		                        multipartFile.transferTo(new File(toPath));
		                        return String.format("{\"code\":\"1\",\"img\":\"%s\"}",realPath);
		                    } catch (IOException e) {
		                        e.printStackTrace();
		                    }
		                   
		                }

		            }

		        }
		} catch (Exception e) {
			e.printStackTrace();
		}
        return String.format("{\"code\":\"0\"}");
       }
	@RequestMapping("/saveuser")
	public Object saveUser(User user){
		//User user=new User();
		//user.setWxCode(wxcode);

		return gson.toJson(userService.insert(user));
	}
	@RequestMapping("/getopenid")
	public Object opennid(String code){
		String appid="wx4df55674fa9dab3d";
		String secret="06d45870725f064edf49e91b30396bef";
		String url=String.format("https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code",appid,secret,code);
		
		return WebUtil.doGet(url);
		//return gson.toJson(userService.insert(user));
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
