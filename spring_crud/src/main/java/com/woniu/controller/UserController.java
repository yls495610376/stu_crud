package com.woniu.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.pojo.Stu;
import com.woniu.service.IStuService;

@Controller
public class UserController {
	
	@Autowired
	private IStuService service;
	
	@RequestMapping("/findAll")
	public String findAll(HttpServletRequest req) {
		System.out.println("UserController.findAll()");
		req.setAttribute("stuList", service.findAll());
		return "list";
	}

	@RequestMapping("findOne")
	public String findOne(Integer sid,HttpServletRequest req) {
		System.out.println("UserController.findOne()");
		req.setAttribute("stu", service.findOne(sid));
		return "findOne";
	}

	@RequestMapping("updateByPrimaryKey")
	public String updateByPrimaryKey(Stu stu,HttpServletRequest req) {
		System.out.println("UserController.updateByPrimaryKey()");
		req.setAttribute("stu", service.updateByPrimaryKey(stu));
		return "findAll";
	}
	
}
