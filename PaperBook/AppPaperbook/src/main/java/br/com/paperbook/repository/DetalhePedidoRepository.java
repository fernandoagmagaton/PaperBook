package br.com.paperbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.paperbook.domain.DetalhePedido;

@Repository
public interface DetalhePedidoRepository extends JpaRepository<DetalhePedido, Integer>{

}
