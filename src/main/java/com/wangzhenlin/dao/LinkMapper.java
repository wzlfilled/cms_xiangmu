package com.wangzhenlin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.wangzhenlin.entity.Link;

/**
 * 
 * @author Administrator
 *
 */
public interface LinkMapper {

	/**
	 * 
	 * @param link
	 * @return
	 */
	@Insert("INSERT INTO cms_link (url,name,created) "
			+ " VALUES(#{url},#{name},now())")
	int add(Link link);
	
	/**
	 * 
	 * @return
	 */
	@Select("SELECT * FROM cms_link ORDER BY created DESC")
	List<Link> list();
	
}
