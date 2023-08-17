package br.com.paperbook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paperbook.domain.Cliente;
import br.com.paperbook.repository.ClienteRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepo;
	
	@GetMapping("/listar")
	public List<Cliente> listar(){
		
		return clienteRepo.findAll();
		
	}
	@GetMapping("/buscar/{id}")
	public Optional<Cliente> buscar(@PathVariable Integer id) {
		return clienteRepo.findById(id);
	}

}
