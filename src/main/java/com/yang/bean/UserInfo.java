package com.yang.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 
 * 配置读取文件的对象
 * @author Java小白
 *
 */
@Component
@ConfigurationProperties(prefix = "userInfo")
//PropertySource默认取application.properties或者application.yml文件 可指定其他文件
//@PropertySource(value = "config.properties")
public class UserInfo {
	private String name;
	private String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
