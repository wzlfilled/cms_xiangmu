package com.wangzhenlin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangzhenlin.dao.ChannelMapper;
import com.wangzhenlin.entity.Channel;
import com.wangzhenlin.service.ChannelService;

@Service
public class ChannelServiceImpl implements ChannelService{

	@Autowired
	ChannelMapper dao;

	@Override
	public List<Channel> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}
	
	
	
}
