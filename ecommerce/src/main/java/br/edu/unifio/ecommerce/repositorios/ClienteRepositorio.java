package br.edu.unifio.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecommerce.entidades.Cliente;


public interface ClienteRepositorio extends JpaRepository < Cliente, Integer> {

}
