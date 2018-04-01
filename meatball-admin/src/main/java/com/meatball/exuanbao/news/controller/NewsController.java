/**
 * Project Name:meatball-admin
 * File Name:NewsController.java
 * Package Name:com.meatball.exuanbao.news.controller
 * Date:2018年3月30日下午3:21:22
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.exuanbao.news.controller;

import javax.annotation.Resource;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meatball.exuanbao.news.model.News;
import com.meatball.exuanbao.news.service.NewsService;
import com.meatball.vo.ResultMsg;

/**   
 * @Title: NewsController.java 
 * @Package com.meatball.exuanbao.news.controller 
 * @Description: TODO(新闻) 
 * @author zk  
 * @date 2018年3月30日 下午3:21:22 
 * @version V1.0   
 */
@Controller
@RequestMapping("/exuanbao/news")
public class NewsController {
	@Resource
	private NewsService newsService;
	
	@GetMapping("/index")
	@RequiresPermissions("exuanbao:news:index")
	public String index(ModelMap map) {
		
		return "exuanbao/news/news";
	}
	
	/**
	 * @Title: listParams 
	 * @Description: TODO(新闻查询) 
	 * @param entity
	 * @return
	 * @return PageInfo<News>    返回类型
	 */
	@GetMapping("/listParams")
	@ResponseBody
	@RequiresPermissions("exuanbao:news:index")
	public PageInfo<News> listParams(News entity) {
		PageInfo<News> listParams = PageHelper.startPage(entity.getOffset(), entity.getLimit()).doSelectPageInfo(() 
				-> newsService.listParams(entity));
		return listParams;
	}
	
	
	/**
	 * @Title: add 
	 * @Description: TODO(新闻添加) 
	 * @param entity
	 * @return
	 * @return ResultMsg    返回类型
	 */
	@PostMapping("/add")
	@ResponseBody
	@RequiresPermissions("exuanbao:news:add")
	public ResultMsg add(News entity) {
		int count = newsService.add(entity);
		if(count == 0){
			return new ResultMsg(1, "新增失败！");	
		}else{
			return new ResultMsg(200, "新增成功！");
		}
	}
	
	
	/**
	 * @Title: edit 
	 * @Description: TODO(新闻更新) 
	 * @param entity
	 * @return
	 * @return ResultMsg    返回类型
	 */
	@PostMapping("/edit")
	@ResponseBody
	@RequiresPermissions("exuanbao:news:edit")
	public ResultMsg edit(News entity) {
		int count = newsService.edit(entity);
		if(count == 0){
			return new ResultMsg(1, "编辑失败！");	
		}else{
			return new ResultMsg(200, "编辑成功！");
		}
	}
	
	
	/**
	 * @Title: delete 
	 * @Description: TODO(新闻删除) 
	 * @param entity
	 * @return
	 * @return ResultMsg    返回类型
	 */
	@PostMapping("/delete")
	@ResponseBody
	@RequiresPermissions("exuanbao:news:delete")
	public ResultMsg delete(News entity) {
		int count = newsService.edit(entity);
		if(count == 0){
			return new ResultMsg(1, "删除失败！");	
		}else{
			return new ResultMsg(200, "删除成功！");
		}
	}
	
	
	/**
	 * @Title: info 
	 * @Description: TODO(新闻详情) 
	 * @param bId
	 * @return
	 * @return News    返回类型
	 */
	@GetMapping("/info")
	@ResponseBody
	@RequiresPermissions("exuanbao:news:info")
	public News info(Long bId) {

		return newsService.info(bId);
	}
}
