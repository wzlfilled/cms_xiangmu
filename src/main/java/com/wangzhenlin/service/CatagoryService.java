package com.wangzhenlin.service;

import java.util.List;

import com.wangzhenlin.entity.Category;

public interface CatagoryService {

	/**
	 * 获取分类
	 * @param chnId  频道id
	 * @return
	 */
	List<Category> listByChannelId(int chnId);
	
}
