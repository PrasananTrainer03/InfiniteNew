package com.java.infinite.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.infinite.config.MvcConfiguration;
import com.java.infinite.dao.EmployDAO;
import com.java.infinite.model.Employ;

@Controller
public class HomeController {

//	static EmployDAO employDao;
//	static {
//		employDao = new MvcConfiguration().getEmployDAO(); 
//	}
	
	@Autowired
	EmployDAO employDao;
	
	 @RequestMapping(value = "/deleteemploy", method = RequestMethod.GET)
	 public ModelAndView deleteEmploy(HttpServletRequest request) {
	     int empno = Integer.parseInt(request.getParameter("empno"));
	     employDao.deleteEmploy(empno);
	     return new ModelAndView("redirect:/");
	 }
	 @RequestMapping(value = "/updateemploy", method = RequestMethod.POST)
	 public ModelAndView updateemploy(@ModelAttribute Employ employ) {
		 employDao.updateEmploy(employ);
	     return new ModelAndView("redirect:/");
	 }
	
	 @RequestMapping(value="/editemploy")
		public ModelAndView editEmploy(HttpServletRequest request) {
		    int empno = Integer.parseInt(request.getParameter("empno"));
		    Employ employ = employDao.get(empno);
		    ModelAndView model = new ModelAndView("employsearchform");
		    model.addObject("employ", employ);
		 
		    return model;
		}
	
	 @RequestMapping(value = "/newemploy", method = RequestMethod.GET)
	 public ModelAndView newContact(ModelAndView model) {
	     Employ employ = new Employ();
	     model.addObject("employ", employ);
	     model.setViewName("employform");
	     return model;
	 }
	 @RequestMapping(value = "/saveemploy", method = RequestMethod.POST)
	 public ModelAndView saveemploy(@ModelAttribute Employ employ) {
	     employDao.addEmploy(employ);
	     return new ModelAndView("redirect:/");
	 }
	 @RequestMapping("/")
	 public ModelAndView listEmploy(ModelAndView model) throws IOException{
		  List<Employ> listEmploy = employDao.list();
		     model.addObject("listEmploy", listEmploy);
		     model.setViewName("home");
		  
		     return model;
	}
}
