package com.yang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.yang.bean.User;

/**
 * 用户登录数据层
 * @author Yang
 *
 */
@Mapper //标识为mybatis数据层接口
public interface UserDao {
	/**
	 *全量查询用户
	 * @param user
	 * @return
	 */
	List<User> getUser();
}
