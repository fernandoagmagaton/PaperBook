package br.com.paperbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paperbook.domain.Pedido;
import br.com.paperbook.repository.PedidoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepo;
	
	@GetMapping("/listar")
	public List<Pedido> listar(){
		return pedidoRepo.findAll();
	}
	
}




