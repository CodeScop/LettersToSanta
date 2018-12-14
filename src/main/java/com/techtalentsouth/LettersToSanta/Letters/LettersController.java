package com.techtalentsouth.LettersToSanta.Letters;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LettersController {

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("blogpost/index");
		return mv;
	}
}
