package com.priya.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
	// @RequestParam to map the browser data to controller key name	
//		HttpSession session = req.getSession();
//		String name = req.getParameter("name");
//		session.setAttribute("name", myName);
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		return mv;
	}
}
 