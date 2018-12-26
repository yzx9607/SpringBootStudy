package com.yang.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yang.bean.User;
import com.yang.dao.UserDao;
import com.yang.service.IUserService;

/**
 * 服务实现
 * @author Yang
 *
 */
@Service //标识为服务类
public class UserServiceImpl implements IUserService {
	//注入数据层接口
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getUser() {
		return userDao.getUser();
	}

	/**
	 * 分页查询用户
	 * @param page 页码
	 * @param size 数量
	 * @return
	 */
	public PageInfo<User> getUsersLimit(int page,int size){
		//首先开启PageHelper的分页
		PageHelper.startPage(page, size);
		//查询分页信息 调用方式与普通方式一致
		List<User> list=userDao.getUser();
		//生成PageInfo对象
		PageInfo<User> pageInfo=new PageInfo<User>(list);		
		//总数据条数
		System.out.println(pageInfo.getTotal());
		//第一页的页码
		System.out.println(pageInfo.getFirstPage());
		//最终页的页码
		System.out.println(pageInfo.getLastPage());
		//下一页的页码
		System.out.println(pageInfo.getNextPage());
		//当前页码
		System.out.println(pageInfo.getPageNum());
		//开始的数据下标
		System.out.println(pageInfo.getStartRow());
		//结束的数据下标
		System.out.println(pageInfo.getEndRow());
		//数据条数
		System.out.println(pageInfo.getSize());
		return pageInfo;
	}
}
