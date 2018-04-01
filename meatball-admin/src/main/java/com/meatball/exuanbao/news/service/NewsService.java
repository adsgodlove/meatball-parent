/**
 * Project Name:meatball-admin
 * File Name:NewsService.java
 * Package Name:com.meatball.exuanbao.news.service
 * Date:2018年3月30日下午3:21:43
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.news.service;

import java.util.List;
import com.meatball.exuanbao.news.model.News;

/**   
 * @Title: NewsService.java 
 * @Package com.meatball.exuanbao.news.service 
 * @Description: TODO(新闻业务接口) 
 * @author zk  
 * @date 2018年3月30日 下午3:21:43 
 * @version V1.0   
 */
public interface NewsService {

	/**
	 * @Title: info 
	 * @Description: TODO(新闻详情) 
	 * @param bId 新闻id
	 * @return
	 * @return News    返回类型
	 */
	public News info(Long bId);
	
	/**
	 * @Title: add 
	 * @Description: TODO(新增新闻) 
	 * @param entity 新闻信息
	 * @return
	 * @return int    返回类型
	 */
	public int add(News entity);
	
	/**
	 * @Title: edit 
	 * @Description: TODO(新闻更新) 
	 * @param entity 新闻信息
	 * @return
	 * @return int    返回类型
	 */
	public int edit(News entity);
	
	/**
	 * @Title: listParams 
	 * @Description: TODO(新闻查询) 
	 * @param entity 新闻信息
	 * @return
	 * @return List<News>    返回类型
	 */
	public List<News> listParams(News entity);
}
