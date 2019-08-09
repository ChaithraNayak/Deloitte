package com.deloitte;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/goToMessage")
	public ModelAndView ssds()
	{
		ModelAndView view= new ModelAndView();
		view.addObject("message","Hello!! It's Thursday");
		view.setViewName("SayHello");
		return view;
	}
		
}
