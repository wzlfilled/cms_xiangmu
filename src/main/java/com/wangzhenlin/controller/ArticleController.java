package com.wangzhenlin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangzhenlin.common.CmsAssert;
import com.wangzhenlin.common.MsgResult;
import com.wangzhenlin.entity.Article;
import com.wangzhenlin.entity.Category;
import com.wangzhenlin.service.ArticleService;
import com.wangzhenlin.service.CatagoryService;

@RequestMapping("article")
@Controller
public class ArticleController {

	@Autowired
	ArticleService articleService;
	@Autowired
	CatagoryService catService; 
	
	@RequestMapping("showdetail")
	public String showDeteil(HttpServletRequest request,Integer id){
		
		Article article = articleService.getById(id);
		CmsAssert.AssertTrueHtml(article!=null, "文章不存在");
		request.setAttribute("article", article);
		return "article/detail";
	}
	
	@RequestMapping("getCategoryByChannel")
	@ResponseBody
	public MsgResult getCategoryByChannel(int chnId) {
		//List<Category> categories =  
		List<Category> categories = catService.listByChannelId(chnId);
		return new MsgResult(1, "",  categories);
		
	}
	
}
