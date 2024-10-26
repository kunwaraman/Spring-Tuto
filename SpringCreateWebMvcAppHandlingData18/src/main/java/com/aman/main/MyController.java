package com.aman.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	
	//@RequestMapping(value="/helloPage".method=RequestMethod.Get)
	//@RequestMapping("/helloPage")
	@GetMapping("/helloPage")
	
	public ModelAndView openHelloPage() {
		System.out.println("openHelloPage() method executed");
		
		
		ModelAndView mav = new ModelAndView("hello");
		//mav.setViewName("hello");
		
		
		return mav;
	}
	
	@GetMapping("/aboutUs")
	public String openAboutUsPage() {
		return "about-us";
	}
	
	
	 

}
