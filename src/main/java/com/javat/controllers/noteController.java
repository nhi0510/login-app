package com.javat.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javat.note.note;
import com.javat.services.UserService;
import com.javat.services.noteService;

@Controller
public class noteController {
	@Autowired
	noteService noteService;
	@GetMapping("/addnote")
	public String  addnote(ModelMap note ,ModelMap model, HttpSession session) {
		if (session.getAttribute("USERNAME") !=null) {
			note t = new note();
			note.addAttribute("note", t);
			note.addAttribute("ACTION", "Savenote");
			return "addnote";
	
	}
	return "login";
	}
			
	
	@PostMapping("/Savenote")
	public String savenote(ModelMap note, @ModelAttribute("note") note Note) {
	//	noteDAO d = new noteDAO() ;
	//	d.save(Note);
	//	System.out.println("size:" +d.getAll().size());
		noteService.save(Note);
		return "addnote";
	}
	@RequestMapping("viewnote")
	public String viewnote(ModelMap note,ModelMap model, HttpSession session) {
	//	noteDAO d = new noteDAO();
	//note.addAttribute("note", d.getAll());
		
		if (session.getAttribute("USERNAME") !=null) {
			note.addAttribute("notes", noteService.findAll());
		
			return "find";

		}
		return "login";
		}
@RequestMapping ("/edit1/{title}")
public String edit(ModelMap note,@PathVariable(name="title") String title) {
	Optional<note> u = noteService.findById(title);
	
	
	note.addAttribute("note",u);
	note.addAttribute("ACTION", "/Savenote");
	return "addnote";
	
	
}
@RequestMapping("/delete1/{title}")
public String delete(ModelMap note,@PathVariable(name="title") String title) {
	noteService.deleteById(title);
	note.addAttribute("notes",noteService.findAll());
	return "find";
}
@RequestMapping("/find")
public String find(ModelMap note,@RequestParam(defaultValue ="") String title) {
	List<note> list = noteService.findByTitleLikeOrderByTitle(title);
	note.addAttribute("notes",list);
	
	return "find";
}
}



