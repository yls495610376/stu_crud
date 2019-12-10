package com.woniu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.StuMapper;
import com.woniu.pojo.Stu;
import com.woniu.service.IStuService;
@Service

public class StuServiceImpl implements IStuService{
	@Autowired
	private StuMapper stuMapper;
	
	@Transactional(readOnly = true)
	public Stu findOne(Integer sid) {
		// TODO Auto-generated method stub
		return stuMapper.selectByPrimaryKey(sid);
	}

}
