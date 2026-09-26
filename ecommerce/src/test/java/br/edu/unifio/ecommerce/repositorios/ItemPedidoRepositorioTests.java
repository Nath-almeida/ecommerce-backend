package br.edu.unifio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entidades.ItemPedido;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ItemPedidoRepositorioTests {
    @Autowired
    private ItemPedidoRepositorio itemPedidoRepositorio;

    @Test
    public void deveBuscarUmItemPedidoPorId() {
        ItemPedido itemPedido = itemPedidoRepositorio.findById(2).orElseThrow();

        assertNotNull(itemPedido);
            
        assertEquals(1, itemPedido.getQuantidade());
        assertEquals(new java.math.BigDecimal("1500.00"), itemPedido.getValorUnitario());
        
        assertNotNull(itemPedido.getProduto());
        assertEquals("Smartphone Pro", itemPedido.getProduto().getNome());
        
        assertNotNull(itemPedido.getPedido());
        assertEquals("Pendente", itemPedido.getPedido().getStatus());
    }

    @Test
    public void deveListarItensPedido() {

        var itensPedido = itemPedidoRepositorio.findAll();

        assertNotNull(itensPedido);
        assertEquals(5, itensPedido.size());
    }
}
