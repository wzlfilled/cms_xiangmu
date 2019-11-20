package com.wangzhenlin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.wangzhenlin.entity.Channel;

public interface ChannelMapper {

	@Select("select * from cms_channel ORDER BY id")
	public List<Channel> list();
	
}
