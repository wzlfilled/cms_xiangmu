package com.wangzhenlin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangzhenlin.dao.CategoryMapper;
import com.wangzhenlin.entity.Category;
import com.wangzhenlin.service.CategoryService;


@Service
public class CatagoryServiceImpl implements CategoryService {

	@Autowired
	CategoryMapper categoryMapper;

	@Override
	public List<Category> listByChannelId(int chnId) {
		// TODO Auto-generated method stub
		return categoryMapper.listByChannelId(chnId);
	}
	
	
	
}
