package com.yang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.yang.bean.ResultObject;
import com.yang.bean.User;
import com.yang.bean.UserInfo;
import com.yang.service.IUserService;

/**
 * @author Java小白
 *
 */
@RestController //标识为返回类型为Json的控制器
public class UserController {
	@Autowired
	private UserInfo userInfo;
	
	//自动注入服务类
	@Autowired
	private IUserService userService;
	
	
	
	
	//标识请求地址
    @RequestMapping("/ymlGetUserName")
    public String ymlGetUserName() {
    
        return userInfo.getName();
    }	
	
	//标识请求地址
    @RequestMapping("/propertieGetUserName")
    public String propertieGetUserName() {
    
        return userInfo.getName();
    }
	
	//标识请求地址
    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "helloworld";
    }
    //标识请求地址
    @RequestMapping("/getuser")
    public ResultObject<List<User>> getUsers() {
    	//查询用户列表
    	List<User> list= userService.getUser();
    	ResultObject<List<User>> rs=new ResultObject<List<User>>();
    	//状态码
    	rs.setCode(0);
    	//提示
    	rs.setMsg("查询成功");
    	//数据
    	rs.setData(list);
   
        return rs;
    }
 
    /**
     * 分页查询用户信息
     * @param page 页码
     * @param size 数量
     * @return
     */
    @RequestMapping("/getuserLimit")
    public ResultObject<List<User>> getUsersLimit(@RequestParam("page") int page,@RequestParam("size") int size){
    	//查询用户列表
    	PageInfo<User> pageInfo=userService.getUsersLimit(page,size);
    	List<User> list= pageInfo.getList();
    	ResultObject<List<User>> rs=new ResultObject<List<User>>();
    	//状态码
    	rs.setCode(0);
    	//提示
    	rs.setMsg("查询成功");
    	//数据
    	rs.setData(list);
    	//条数
    	rs.setCount(pageInfo.getTotal());
        return rs;
    }
}
