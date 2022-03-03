package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repositorys.IeventoRepository;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/lista")
@AllArgsConstructor
public class EventosController {

	
	
    @Autowired
	private IeventoRepository repository;
	
	@GetMapping
	public String showEventosList(Model model) {
		
		model.addAttribute("eventos", repository.findAll());
		return "eventosList";
	}
	
	
}

