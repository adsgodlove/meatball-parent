/**
 * Project Name:meatball-rest
 * File Name:NoteApiService.java
 * Package Name:com.meatball.api.note.service
 * Date:2018年3月30日下午2:56:44
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/
package com.meatball.api.note.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.meatball.api.note.parems.FeedbackParems;
import com.meatball.api.note.parems.FeedbackResultParems;
import com.meatball.api.note.parems.MyNoteInfoParems;
import com.meatball.api.note.parems.MyNoteParems;
import com.meatball.exuanbao.note.dao.FeedbackMapper;
import com.meatball.exuanbao.note.dao.NoteMapper;
import com.meatball.exuanbao.note.model.Feedback;
import com.meatball.exuanbao.note.model.Note;
import com.meatball.exuanbao.personal.dao.AccountMapper;
import com.meatball.exuanbao.personal.model.Account;
import com.meatball.utils.DateUtil;
import com.meatball.vo.ResultMsg;

/**   
 * @Title: NoteApiService.java 
 * @Package com.meatball.api.note.service 
 * @Description: TODO(服务消息) 
 * @author jw  
 * @date 2018年3月30日 下午2:56:44 
 * @version V1.0   
 */
@Service
public class NoteApiService {
	
	@Resource
	private NoteMapper noteMapper;
	
	@Resource
	private FeedbackMapper feedbackMapper;
	
	@Resource
	private AccountMapper accountMapper;

	/**
	 * @Title: getMyNoteList 
	 * @Description: TODO(获取服务消息列表) 
	 * @param userid
	 * @return
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg getMyNoteList(String userid) {
		MyNoteParems info = new MyNoteParems(); 
		ResultMsg msg = new ResultMsg(200, info);
		List<Note> list = noteMapper.selectListByUserid(userid);
		if(null != list && list.size() > 0) {
			info.setResultCode(1);
			info.setResultMsg("操作成功");
			info.setList(list);
		} else {
			info.setResultCode(1);
			info.setResultMsg("无服务信息");
		}
		return msg;
	}

	/**
	 * @Title: getMyNoteInfo 
	 * @Description: TODO(获取服务消息详情) 
	 * @param noteid
	 * @return
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg getMyNoteInfo(String noteid) {
		MyNoteInfoParems info = new MyNoteInfoParems(); 
		ResultMsg msg = new ResultMsg(200, info);
		Note note = noteMapper.selectByPrimaryKey(Long.parseLong(noteid));
		if(null != note) {
			info.setResultCode(1);
			info.setResultMsg("操作成功");
			info.setbId(note.getbId());
			info.setiStatus(note.getiStatus());
			info.setiType(note.getiType());
			switch (note.getiType()) {
			case 1:
				info.setiTypeName("消息");
				break;
			case 2:
				info.setiTypeName("公告");
				break;
			default:
				break;
			}
			
			info.settCreatetime(DateUtil.getTime(note.gettCreatetime()));
			info.settSendtime(DateUtil.getTime(note.gettSendtime()));
			info.setvContent(note.getvContent());
			info.setvTitle(note.getvTitle());
		} else {
			info.setResultCode(0);
			info.setResultMsg("无此信息");
		}
		return msg;
	}

	/**
	 * @Title: getFeedbackResult 
	 * @Description: TODO(意见反馈操作) 
	 * @param parems
	 * @return
	 * @return ResultMsg    返回类型
	 */
	public ResultMsg getFeedbackResult(FeedbackParems parems) {
		FeedbackResultParems info = new FeedbackResultParems();
		ResultMsg msg = new ResultMsg(200, info);
		Account account = accountMapper.selectByPrimaryKey(Long.parseLong(parems.getUserid()));
		if(null != account) {
			Feedback record= new Feedback();
			record.setCreatedate(new Date());
			record.setPlatformId(account.getPlatformid());
			record.setState(1);
			record.setUserId(account.getbId());
			record.setUserName(account.getName());
			record.setUserTel(account.getPhone());
			record.setContent(parems.getContent());
			int m = feedbackMapper.insertSelective(record);
			if(m == 1) {
				info.setResultCode(1);
				info.setResultMsg("反馈成功");
			} else {
				info.setResultCode(0);
				info.setResultMsg("反馈失败");
			}
		} else {
			info.setResultCode(0);
			info.setResultMsg("请先注册用户信息");
		}
		
		return msg;
	}

}
