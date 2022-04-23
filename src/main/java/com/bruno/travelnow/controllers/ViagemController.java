package com.bruno.travelnow.controllers;

import javax.validation.Valid;

import com.bruno.travelnow.models.Viagem;
import com.bruno.travelnow.repository.ViagemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/viagens/")
public class ViagemController {

    
	@Autowired
	ViagemRepository viagemRepository;
	
	@GetMapping("list")
	public String getAllViagens(Model model) {
		model.addAttribute("viagens", viagemRepository.findAll());
		return "index";
	}
	
	@GetMapping("novo")
	public String novaViagem(Viagem viagem)
	{
		return "add-viagem";
	}
	
	@PostMapping("add")
	public String addViagem(@Valid Viagem viagem, 
			BindingResult result, Model model)
	{
		if(result.hasErrors()) {
			return "add-viagem";
		}
		
		viagemRepository.save(viagem);
		return "redirect:list";
	}
	
    
}
