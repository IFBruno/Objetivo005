package br.edu.ifsul.cstsi.projeto005.model;

import jakarta.persistence.*;

import java.util.List;

@Embeddable // Vai ser adicionada na tabela Socio
public class Categoria {
    @Id @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private String des_cat;

    //@OneToMany
    private List<Socio> socios;
}
