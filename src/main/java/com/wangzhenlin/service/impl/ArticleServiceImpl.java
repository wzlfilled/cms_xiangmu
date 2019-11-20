package com.wangzhenlin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangzhenlin.common.ConstantClass;
import com.wangzhenlin.dao.ArtivcleMapper;
import com.wangzhenlin.entity.Article;
import com.wangzhenlin.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArtivcleMapper dao;

	@Override
	public List<Article> getNewArticles(int i) {
		// TODO Auto-generated method stub
		return dao.newList(i);
	}

	@Override
	public PageInfo<Article> hotlist(int page) {
		PageHelper.startPage(page, ConstantClass.PAGE_SIZE);
		return new PageInfo<Article>(dao.hosrList());
	}

	@Override
	public Article getById(Integer id) {
		// TODO Auto-generated method stub
		return dao.getBuId(id);
	}

	@Override
	public PageInfo<Article> listByCat(int chnId, int categortId, int page) {
		PageHelper.startPage(page, ConstantClass.PAGE_SIZE);
		return new PageInfo<Article>(dao.listByCat(chnId, categortId));
	}
	
	@Override
	public PageInfo<Article> listByUser(int page,Integer userId) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, ConstantClass.PAGE_SIZE);
		return new PageInfo<Article>(dao.listByUser(userId));
	
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	/* (non Javadoc) 
	 * @Title: checkExist
	 * @Description: TODO
	 * @param id
	 * @return 
	 * @see com.zhukaige.service.ArticleService#checkExist(int) 
	 */
	@Override
	public Article checkExist(int id) {
		// TODO Auto-generated method stub
		return  dao.checkExist(id);
	}

	/* (non Javadoc) 
	 * @Title: getPageList
	 * @Description: TODO
	 * @param status
	 * @param page
	 * @return 
	 * @see com.zhukaige.service.ArticleService#getPageList(int, java.lang.Integer) 
	 */
	@Override
	public PageInfo<Article> getPageList(int status, Integer page) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, ConstantClass.PAGE_SIZE);
		return new PageInfo<Article>(dao.listByStatus(status));
	}

	@Override
	public Article getDetailById(int id) {
		// TODO Auto-generated method stub
		return dao.getDetailById(id);
	}

	@Override
	public int apply(int id, int status) {
		// TODO Auto-generated method stub
		return dao.apply(id,status);
	}

	@Override
	public int setHot(int id, int status) {
		// TODO Auto-generated method stub
		return dao.setHot(id,status);
	}

	@Override
	public int add(Article article) {
		// TODO Auto-generated method stub
		return dao.add(article);
	}
	
}
