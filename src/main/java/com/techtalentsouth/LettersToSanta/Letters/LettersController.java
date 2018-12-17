package com.techtalentsouth.LettersToSanta.Letters;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LettersController {
	
	@Autowired
	private LettersRepository lettersRepository;

	//home page
	@GetMapping("/")
	public ModelAndView index(Letters letters) {
		ModelAndView mv = new ModelAndView("letters/index");
		mv.addObject("letters", lettersRepository.findAll());
		return mv;
	}
	
	//shows the form for creating a new letter
	@GetMapping("/letters/new_letter")
	public ModelAndView new_letter(Letters letters) {
		ModelAndView mv = new ModelAndView("letters/new");
		return mv;
	}
	
	//handles the saving of the letter and shows the letter after creation
	@PostMapping("/letters/new_letter")
	public ModelAndView create_letter(Letters letters) {
		ModelAndView mv = new ModelAndView("letters/letter-view");
		Letters letter = lettersRepository.save(letters);
		mv.addObject("letter", letter);
		return mv;
	}
	
	//shows the form for editing a letter
	@GetMapping("/letters/edit/{id}")
	public ModelAndView updateLetterForm(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView("letters/edit");
		Optional<Letters> letter = lettersRepository.findById(id);
		mv.addObject("letter", letter);
		return mv;
	}
	
	//saves the edits to the letter
	@PutMapping("/letters/update")
	public ModelAndView updateLetter(Letters letter) {
		ModelAndView mv = new ModelAndView("redirect:/");
		lettersRepository.save(letter);
		return mv;
	}
	
	//deletes letter
	@DeleteMapping("/letters/delete/{id}")
	public ModelAndView deleteLetter(@PathVariable("id") long id) {
		ModelAndView mv = new ModelAndView("redirect:/");
		lettersRepository.deleteById(id);
		return mv;
	}
	
	//gets christmasHistory.html page
	@GetMapping("/letters/christmas-history")
	public ModelAndView christmasHistory() {
		ModelAndView mv = new ModelAndView("letters/christmasHistory");
		return mv;
	}
}
}
