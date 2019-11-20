package com.wangzhenlin.entity;

import java.io.Serializable;
import java.util.Date;

import com.wangzhenlin.common.ConstantClass;

public class User implements Serializable{
	
	private static final long seriaVersionUID = 6460832723994198125L;

	private Integer id;
	private String username;
	private String password;
	//昵称没有用上
	private String nickname;
	//生日
	private Date birthday;
	//性别
	private Integer gender;
	//是否被解禁
	private Integer locked;
	//注册时间
	private Date createTime;
	private Date updateTime;
	//没有用上
	private String url;
	//没有用上
	private Integer score;
	
	private int role=ConstantClass.USER_ROLE_GENERAL;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getLocked() {
		return locked;
	}

	public void setLocked(Integer locked) {
		this.locked = locked;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	
	
}
