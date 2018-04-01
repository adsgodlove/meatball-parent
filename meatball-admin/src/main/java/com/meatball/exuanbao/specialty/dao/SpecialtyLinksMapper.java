package com.meatball.exuanbao.specialty.dao;

import com.meatball.exuanbao.specialty.model.SpecialtyLinks;

public interface SpecialtyLinksMapper {
    int insert(SpecialtyLinks record);

    int insertSelective(SpecialtyLinks record);
}