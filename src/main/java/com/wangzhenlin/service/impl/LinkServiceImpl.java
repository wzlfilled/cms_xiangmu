package com.wangzhenlin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangzhenlin.dao.LinkMapper;
import com.wangzhenlin.entity.Link;
import com.wangzhenlin.service.LinkService;


@Service
public class LinkServiceImpl implements LinkService{

	@Autowired
	LinkMapper linkMapper;

	@Override
	public int add(Link link) {
		// TODO Auto-generated method stub
		return linkMapper.add(link);
	}

	@Override
	public PageInfo list(int page) {
		PageHelper.startPage(page, 10);
		return new PageInfo<Link>(linkMapper.list());
	}
	
}
