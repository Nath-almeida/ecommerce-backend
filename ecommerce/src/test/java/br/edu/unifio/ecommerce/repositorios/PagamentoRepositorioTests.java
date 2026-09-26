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

import br.edu.unifio.ecommerce.entidades.Pagamento;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PagamentoRepositorioTests {

    @BeforeAll 
    public static void setup() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
    }
    @Autowired
    private PagamentoRepositorio pagamentoRepositorio;

    @Test
    public void deveBuscarUmPagamentoPorId() {
        Pagamento pagamento = pagamentoRepositorio.findById(1).orElseThrow();

        assertNotNull(pagamento);
        assertEquals(1, pagamento.getPedido().getId());
        assertEquals(new java.math.BigDecimal("73.44"), pagamento.getValor());
        assertEquals(LocalDateTime.parse("2023-10-01T10:05:00"), pagamento.getData());
        assertEquals("Aprovado", pagamento.getStatus());
        assertEquals("PIX", pagamento.getTipo());

    }

    @Test
    public void deveListarPagamento() {

        var pagamento = pagamentoRepositorio.findAll();

        assertNotNull(pagamento);
        assertEquals(5, pagamento.size());
    }
}