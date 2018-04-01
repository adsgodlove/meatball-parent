package com.meatball.file.dao;

import java.util.List;
import com.meatball.file.model.File;

/**
 * @Title: FileMapper.java 
 * @Package com.meatball.api.file.dao 
 * @Description: TODO(附件) 
 * @author zk  
 * @date 2018年3月22日 上午11:19:38 
 * @version V1.0
 */
public interface FileMapper {
    int deleteByPrimaryKey(Long bId);

    int insert(File record);

    int insertSelective(File record);

    File selectByPrimaryKey(Long bId);

    int updateByPrimaryKeySelective(File record);

    int updateByPrimaryKey(File record);
    
    //通过关联id查询附件
    List<File> selectByFid(Long bFid);
}