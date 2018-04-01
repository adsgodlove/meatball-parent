package com.meatball.exuanbao.school.dao;

import java.util.List;
import com.meatball.exuanbao.school.model.SchoolSpecialtyLinks;

public interface SchoolSpecialtyLinksMapper {
    int insert(SchoolSpecialtyLinks record);

    int insertSelective(SchoolSpecialtyLinks record);
    
    int deleteBySchoolid(Long bSchoolid);
    
    List<Long> selectBySchoolid(Long bSchoolid);
}