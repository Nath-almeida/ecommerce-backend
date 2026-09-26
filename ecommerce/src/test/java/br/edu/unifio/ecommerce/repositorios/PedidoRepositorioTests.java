package br.edu.unifio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.util.TimeZone;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entidades.Pedido;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PedidoRepositorioTests {
    @BeforeAll 
    public static void setup() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }
    @Autowired
    private PedidoRepositorio PedidoRepositorio;

    @Test
    public void deveBuscarUmPedidoPorId() {

        Pedido pedido = PedidoRepositorio.findById(4).orElseThrow();
        
        assertNotNull(pedido);
        assertEquals(4, pedido.getCliente().getId());
        assertEquals(new java.math.BigDecimal ("250.00"), pedido.getValorTotal());
        assertEquals(LocalDateTime.parse("2023-10-04T16:45:00"), pedido.getData());
        assertEquals("Cancelado", pedido.getStatus());
    }

    @Test
    public void deveListarPagamento() {

        var pedido = PedidoRepositorio.findAll();

        assertNotNull(pedido);
        assertEquals(5, pedido.size());
    }
}
