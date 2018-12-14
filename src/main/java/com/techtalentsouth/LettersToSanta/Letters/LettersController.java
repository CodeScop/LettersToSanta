package com.techtalentsouth.LettersToSanta.Letters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LettersController {
	
	@Autowired
	private LettersRepository lettersRepository;

	//home page
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("letters/index");
		return mv;
	}
	
	//shows the form for creating a new letter
	@GetMapping("/letters/new_letter")
	public ModelAndView new_letter() {
		ModelAndView mv = new ModelAndView("letters/new");
		return mv;
	}
	
	//shows the letter after creation
	@GetMapping("/letter/letter_view")
	public ModelAndView letter_view() {
		ModelAndView mv = new ModelAndView("letters/letter-view");
		return mv;
	}
}
