/**
 * Project Name:meatball-admin
 * File Name:NewsServiceImpl.java
 * Package Name:com.meatball.exuanbao.news.service.impl
 * Date:2018年3月30日下午3:27:57
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.news.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.meatball.exuanbao.news.dao.NewsMapper;
import com.meatball.exuanbao.news.model.News;
import com.meatball.exuanbao.news.service.NewsService;

/**   
 * @Title: NewsServiceImpl.java 
 * @Package com.meatball.exuanbao.news.service.impl 
 * @Description: TODO(新闻业务接口实现) 
 * @author zk  
 * @date 2018年3月30日 下午3:27:57 
 * @version V1.0   
 */
@Service
public class NewsServiceImpl implements NewsService {
	@Resource
	private NewsMapper newsMapper;
	
	/**
	 * @Title: info 
	 * @Description: TODO(新闻详情) 
	 * @param bId 新闻id
	 * @return
	 * @return News    返回类型
	 */
	@Override
	public News info(Long bId) {
		News entity = newsMapper.selectByPrimaryKey(bId); 
		return entity == null ? new News() : entity;
	}

	/**
	 * @Title: add 
	 * @Description: TODO(新增新闻) 
	 * @param entity 新闻信息
	 * @return
	 * @return int    返回类型
	 */
	@Override
	public int add(News entity) {
		
		return newsMapper.insertSelective(entity);
	}

	/**
	 * @Title: edit 
	 * @Description: TODO(新闻更新) 
	 * @param entity 新闻信息
	 * @return
	 * @return int    返回类型
	 */
	@Override
	public int edit(News entity) {
		
		return newsMapper.updateByPrimaryKeySelective(entity);
	}

	/**
	 * @Title: listParams 
	 * @Description: TODO(新闻查询) 
	 * @param entity 新闻信息
	 * @return
	 * @return List<News>    返回类型
	 */
	@Override
	public List<News> listParams(News entity) {
		
		return newsMapper.listParams(entity);
	}

}
