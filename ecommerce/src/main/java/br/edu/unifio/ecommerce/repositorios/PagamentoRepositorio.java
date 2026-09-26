package br.edu.unifio.ecommerce.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecommerce.entidades.Pagamento;

public interface PagamentoRepositorio extends JpaRepository <Pagamento, Integer>{

}
