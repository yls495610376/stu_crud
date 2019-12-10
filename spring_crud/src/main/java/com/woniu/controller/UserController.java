package com.woniu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.pojo.Stu;
import com.woniu.service.IStuService;
import com.woniu.service.impl.StuServiceImpl;

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
	private void mian() {
		// TODO Auto-generated method stub
		System.out.println("wo fengle!!");
	}
	
}
