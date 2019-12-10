package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.StuMapper;
import com.woniu.pojo.Stu;
import com.woniu.service.IStuService;
@Service
public class StuServiceImpl implements IStuService{
	@Autowired
	private StuMapper mapper;
	
	@Transactional(readOnly = true)
	public List<Stu> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}
	
}