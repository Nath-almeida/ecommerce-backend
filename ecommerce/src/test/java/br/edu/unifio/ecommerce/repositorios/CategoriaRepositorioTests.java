package br.edu.unifio.ecommerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecommerce.entidades.Categoria;

@SpringBootTest 
@TestMethodOrder (MethodOrderer.OrderAnnotation.class)
public class CategoriaRepositorioTests {
    @Autowired 
    private CategoriaRepositorio categoriaRepositorio;

    @Test 
    public void deveBuscarUmaCategoriaPorId () {
        Categoria categoria = categoriaRepositorio.findById(Short.parseShort("2")).orElseThrow();

        assertNotNull (categoria);
        assertEquals("Eletrônicos", categoria.getNome());
    }
}
