package com.woniu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.service.IStuService;

@Controller
public class UserController {
	@Autowired
	private IStuService service;
	@RequestMapping("findOne")
	public String findOne(Integer sid,HttpServletRequest req) {
		System.out.println("UserController.findOne()");
		req.setAttribute("stu", service.findOne(sid));
		
		return "findOne";
		
	}
	
}
