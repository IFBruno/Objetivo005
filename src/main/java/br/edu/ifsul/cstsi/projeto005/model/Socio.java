package br.edu.ifsul.cstsi.projeto005.model;

import jakarta.persistence.*;

import java.util.List;
@Entity (name = "Socio")
@Table (name = "socios")
public class Socio {
    @Id @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private long cartao_socio;
    private String nome_socio;
    private String end_socio;
    @Column (name = "telefone", nullable = false, length = 11)
    private String tel_socio;
    @Column (name = "email", nullable = false, length = 50, unique = true) //nullable = false (Not Null ativado)
    private String email_socio;

    //@OneToMany
    @Embedded // Juntar as informações da tabela categoria na tabela Socio
    private Categoria categoria;

    @OneToMany(mappedBy = "socio")
    private List<Dependente> dependentes;

    @ManyToMany
    @JoinTable (name = "socio_mensalidades",
                joinColumns = @JoinColumn(name = "socio_cartao_socio"),
                inverseJoinColumns = @JoinColumn (name = "mensalidade_des_cat")
    )
    private List<Mensalidade> mensalidades;
}
