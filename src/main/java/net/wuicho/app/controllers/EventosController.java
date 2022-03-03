package net.wuicho.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.wuicho.app.entity.Evento;
import net.wuicho.app.entity.Persona;
import net.wuicho.app.repository.IEventoRepository;
import net.wuicho.app.repository.IPersonaRepository;

@Controller
public class EventosController {

	private IEventoRepository repository;
	
	
	private IPersonaRepository personaRepository;
	
	@Autowired
	public EventosController(IEventoRepository repository, IPersonaRepository personaRepository) {
		this.repository = repository;
		this.personaRepository = personaRepository;
	}
	
	@ModelAttribute("personas")
	public List<Persona> personas(){
		return personaRepository.findAll();
	}
	
	@GetMapping
	public String showEventosList(Model model) {
		model.addAttribute("eventos", repository.findAll());
		return "eventosList";
	}
	
	@GetMapping("/form")
	public String showEventForm(Evento evento) {
		return "eventosForm";
	}
	
	@PostMapping
	public String createEvento(Evento evento) {
		repository.save(evento);
		return "redirect:/";
	}
	
}

