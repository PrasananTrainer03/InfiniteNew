package com.java.infinite.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.infinite.dao.EmployDAO;
import com.java.infinite.model.Employ;

@Controller
public class HomeController {

	 @Autowired
	 private EmployDAO employDAO;
	 
	 @RequestMapping("/")
	 public ModelAndView listEmploy(ModelAndView model) throws IOException{
		  List<Employ> listEmploy = employDAO.list();
		     model.addObject("listEmploy", listEmploy);
		     model.setViewName("home");
		  
		     return model;
	}
}
