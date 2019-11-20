package com.wangzhenlin.common;

/**
 * 抛出异常   异常在html页面显示
 * @author Administrator
 *
 */
public class CmcExceptionHtml  extends RuntimeException{

	private static final long serialVersionUID = -6762629250308786819L;
	
	
	public CmcExceptionHtml(String msg){
		super(msg);
	}
	
}
