package br.edu.unifio.ecommerce.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Categoria {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Short id;
    private String nome;
    private String descricao;
}
