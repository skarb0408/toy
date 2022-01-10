package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.dto.Room;
import com.test.service.RoomService;

@Controller
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	@RequestMapping(value = "/allList", method = RequestMethod.GET)
	public String roomList(Model model) {
		
		model.addAttribute("roomList", roomService.getRoomList());
		return "/roomList/allList";
	}
	
	@RequestMapping(value = "/addList", method = RequestMethod.GET)
	public String addList() {
		
		return "/roomList/addList";
	}
	@RequestMapping(value = "/addList", method = RequestMethod.POST)
	public String addList(@ModelAttribute Room room) {
		
		roomService.addList(room);
		return "redirect:/allList";
	}
}
