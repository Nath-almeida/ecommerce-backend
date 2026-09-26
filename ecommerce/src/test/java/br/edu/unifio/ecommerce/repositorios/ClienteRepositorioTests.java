package br.edu.unifio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entidades.Cliente;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ClienteRepositorioTests {
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test
    public void deveBuscarUmaCategoriaPorId() {
        Cliente cliente = clienteRepositorio.findById(1).orElseThrow();

        assertNotNull(cliente);
        assertEquals("João Silva", cliente.getNome());
    }

    @Test
    public void deveListarClientes() {

        var clientes = clienteRepositorio.findAll();

        assertNotNull(clientes);
        assertEquals(5, clientes.size());
    }
}