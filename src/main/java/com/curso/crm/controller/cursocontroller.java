package com.curso.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.curso.crm.model.cursomodel;
import com.curso.crm.repository.cursorepository;

@RestController
@RequestMapping("/curso")
public class cursocontroller {
	
	@Autowired
	private cursorepository cursoRepository;
	
	@GetMapping
	public List<cursomodel> listar(){
		return cursoRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public cursomodel adicionar(@RequestBody cursomodel cursomodel) {
		return cursoRepository.save(cursomodel);
	}
	
	@DeleteMapping
	public void deletar() {
		cursoRepository.deleteAll();
	}
	
	@PutMapping
	public cursomodel update(@RequestBody cursomodel cursomodel) {
		return cursoRepository.save(cursomodel);
	}

}

