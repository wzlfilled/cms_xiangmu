package com.wangzhenlin.service;

import com.github.pagehelper.PageInfo;
import com.wangzhenlin.entity.Link;

public interface LinkService {

	int add(Link link);
	PageInfo list(int page);
	
}
