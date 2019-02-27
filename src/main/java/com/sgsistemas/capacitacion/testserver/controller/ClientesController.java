package com.sgsistemas.capacitacion.testserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sgsistemas.capacitacion.testserver.domain.Cliente;
import com.sgsistemas.capacitacion.testserver.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> getAll() {
		return this.clienteRepository.findAll();
	}
	
	@PostMapping
	public Cliente save(@RequestBody Cliente c) {
		return this.clienteRepository.save(c);
	}
	
	@GetMapping("/{id}")
	public Cliente getById(@PathVariable("id") Long id) {
		return this.clienteRepository.findById(id).orElse(null);
	}
	
}
