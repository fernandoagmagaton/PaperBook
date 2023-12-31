package br.com.paperbook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.paperbook.domain.Cargo;
import br.com.paperbook.repository.CargoRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/cargo")
public class CargoController {

	@Autowired
	private CargoRepository cargoRepo;
	
	@GetMapping("/listar")
	public List<Cargo> listar(){
		return cargoRepo.findAll();
	}
	@GetMapping("/buscar/{id}")
	public Optional<Cargo> buscar(@PathVariable Integer id) {
		return cargoRepo.findById(id);
	}
	
	@PostMapping("/cadastrar")
	public Cargo cadastrar(@RequestBody Cargo cargo) {
		return cargoRepo.save(cargo);
	}
	
	@PutMapping("/atualizar/{id}")
	public Cargo atualizar(@PathVariable Integer id, @RequestBody Cargo cargo) {
		
		Optional<Cargo> cr = cargoRepo.findById(id);
		Cargo cg = new Cargo();
		if(cr.isPresent()) {
			cg.setIdcargo(id);
			cg.setTitulocargo(cargo.getTitulocargo());
			cg.setBeneficio(cargo.getBeneficio());
			cg.setSalario(cargo.getSalario());
			cg.setCargahoraria(cargo.getCargahoraria());
			cargoRepo.save(cg);
		}
		return cg;
		
	}
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Integer id) {
		cargoRepo.deleteById(id);
		return "Cargo apagado";
	}
}





