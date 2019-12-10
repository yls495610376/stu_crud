package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Stu;

public interface IStuService {
	List<Stu> findAll();

	Stu findOne(Integer sid);
	
	int updateByPrimaryKey(Stu stu);
}
