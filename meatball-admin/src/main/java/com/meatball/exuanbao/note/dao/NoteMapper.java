package com.meatball.exuanbao.note.dao;

import java.util.List;

import com.meatball.exuanbao.note.model.Note;

public interface NoteMapper {
    int deleteByPrimaryKey(Long bId);

    int insert(Note record);

    int insertSelective(Note record);

    Note selectByPrimaryKey(Long bId);

    int updateByPrimaryKeySelective(Note record);

    int updateByPrimaryKey(Note record);

	List<Note> listParams(Note entity);

	/**
	 * @Title: selectListByUserid 
	 * @Description: TODO(查询用户的通知列表) 
	 * @param userid
	 * @return
	 * @return List<Note>    返回类型
	 */
	List<Note> selectListByUserid(String userid);
}