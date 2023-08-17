package br.com.paperbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paperbook.domain.DetalhePedido;
import br.com.paperbook.repository.DetalhePedidoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/detalhepedido")
public class DetalhePedidoController {

	@Autowired
	private DetalhePedidoRepository dpRepo;
	
	@GetMapping("/listar")
	public List<DetalhePedido> listar(){
		return dpRepo.findAll();
	}
}
