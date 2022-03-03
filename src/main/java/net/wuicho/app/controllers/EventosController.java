package net.wuicho.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.wuicho.app.repository.IEventoRepository;

@Controller
public class EventosController {

	private IEventoRepository repository;
	
	@Autowired
	public EventosController(IEventoRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	public String showEventosList(Model model) {
		model.addAttribute("eventos", repository.findAll());
		return "eventosList";
	}
	
	
}

