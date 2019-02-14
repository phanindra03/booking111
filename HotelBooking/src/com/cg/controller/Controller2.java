package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entity.hoteldetails;
import com.cg.service.HotelService;




@Controller
public class Controller2 {
	@Autowired
	private HotelService hotelService;
	@RequestMapping(value="/index")
	public String getHomePage(Model model){
	model.addAttribute("hotelList",hotelService.loadAll());
		model.addAttribute("hotel",new hoteldetails());
	return "index";
	}
	
	@RequestMapping(value="/save")
public String getHome(@RequestParam(value="uid") String name,Model model){
	hoteldetails hotel=new hoteldetails();
	//model.addAttribute("film",new Film());
	//model.addAttribute("film",film.getFilmname());
	model.addAttribute("message",name);
	//System.out.println(film.getFilmname());
	return "BookingConfirmation";
}
	
}
