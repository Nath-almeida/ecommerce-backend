package br.edu.unifio.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecommerce.entidades.Pedido;

public interface PedidoRepositorio extends JpaRepository <Pedido, Integer>{

}
