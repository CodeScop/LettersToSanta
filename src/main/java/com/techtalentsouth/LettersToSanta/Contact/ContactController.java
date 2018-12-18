package com.techtalentsouth.LettersToSanta.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {
	
	@Autowired
	private ContactRepository contactRepository;

	//shows the form to contact us
	@GetMapping("/contact-us")
	public ModelAndView contactUs(Contact contact) {
		ModelAndView mv = new ModelAndView("contact/index");
		return mv;
	}
	
	//handles the saving of the form and shows the message after sent
	@PostMapping("/contact-us")
	public ModelAndView messageSent(Contact contact) {
		ModelAndView mv = new ModelAndView("contact/message");
		Contact message = contactRepository.save(contact);
		mv.addObject("message", message);
		return mv;
	}
	
}
