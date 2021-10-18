package demo.SpringHelloWorld.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/home")
	public ModelAndView testHome(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="calcinput") 
	public ModelAndView calcInput() {
		return new ModelAndView("calcinput");
	}
	
	@RequestMapping(value="login") 
	public ModelAndView logininput() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="loginvalid") 
	public ModelAndView loginvalid(HttpServletRequest req, HttpServletResponse res) {
		String user = req.getParameter("userName");
		String pwd = req.getParameter("passWord");
		if (user.equals("Gowtham") && pwd.equals("Sekhar")) {
			return new ModelAndView("menu");
		}
		return new ModelAndView("login","error","Please give Valid Credentials...");
	}
	@RequestMapping(value="/name")
	public ModelAndView fullName(HttpServletRequest req, HttpServletResponse res) {
		String fullName,firstName,lastName;
		firstName=req.getParameter("firstName");
		lastName = req.getParameter("lastName");
		fullName = firstName + " " +lastName;
		return new ModelAndView("nameresult", "fullName", fullName);
	}
	
	@RequestMapping(value="/nameinput")
	public ModelAndView testName(HttpServletRequest req, HttpServletResponse response) throws IOException{
		return new ModelAndView("/nameinput");
	}
	@RequestMapping(value="/calc")
	public ModelAndView testCalc(HttpServletRequest req, HttpServletResponse response) throws IOException{
		int firstNo,secondNo,res;
		firstNo = Integer.parseInt(req.getParameter("firstNo"));
		secondNo = Integer.parseInt(req.getParameter("secondNo"));
		res=firstNo+secondNo;
		String result="";
		result+=res;
		return new ModelAndView("calcresult","res",result);
	}
	@RequestMapping(value="/manish") 
	public ModelAndView manish(HttpServletResponse response) throws IOException{
		return new ModelAndView("manish");
	}
	
	@RequestMapping(value="/arti") 
	public ModelAndView arti(HttpServletResponse response) throws IOException{
		return new ModelAndView("arti");
	}
	@RequestMapping(value="/shashank")
	public ModelAndView shashank(HttpServletResponse response) throws IOException{
		return new ModelAndView("krishna");
	}
}
