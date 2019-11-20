package com.wangzhenlin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangzhenlin.dao.CategoryMapper;
import com.wangzhenlin.entity.Category;
import com.wangzhenlin.service.CatagoryService;


@Service
public class CatagoryServiceImpl implements CatagoryService {

	@Autowired
	CategoryMapper dao;

	@Override
	public List<Category> listByChannelId(int chnId) {
		// TODO Auto-generated method stub
		return dao.listBuChannelId(chnId);
	}
	
	
	
}
