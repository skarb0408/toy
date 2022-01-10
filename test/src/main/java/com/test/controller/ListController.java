package com.test.controller;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.dto.Sawon;
import com.test.service.SawonService;

@Controller
public class ListController {
	
	@Autowired
	private SawonService sawonService;
	
	
	@RequestMapping(value = "/sawonList", method = RequestMethod.GET)
	public String sawonList(Model model) {
		
		System.out.println(sawonService.getSawonList().size());
		
		model.addAttribute("sawonList", sawonService.getSawonList());
		return "/list/sawonList";
	}
	
	@RequestMapping(value = "/sawonList", method = RequestMethod.POST)
	public String addSawon(@ModelAttribute Sawon sawon, Model model) throws IllegalStateException, IOException {
		
		sawonService.addSawon(sawon);
		model.addAttribute("sawonList", sawonService.getSawonList());
		return "redirect:/sawonList";
	}
	
	/* 삭제 */	
	@RequestMapping(value = "/delete/{no}")
	public String removeSawon(@PathVariable(name = "no") int no, Model model) {
		sawonService.removeSawon(no);
		return "redirect:/sawonList";
	}
	
	/* 수정 */
	@RequestMapping(value = "/updateSawon/{no}", method = RequestMethod.GET)
	public String modifySawon(@ModelAttribute Sawon sawon, Model model) {
		model.addAttribute("sawon", sawonService.getSawonSelect(sawon.getNo()));
		
		return "list/updateSawon";
	}
	
	@RequestMapping(value = "/updateSawon/{no2}", method = RequestMethod.POST)
	public String updateSawon(@ModelAttribute Sawon sawon, Model model) {
		sawonService.modifySawon(sawon);
		return "redirect:/sawonList";
	}
	
	
}
