package br.edu.ifsul.cstsi.projeto005.model;

import jakarta.persistence.*;

@Entity(name = "Dependente")
@Table (name = "dependentes")
public class Dependente {
    @Id @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private long cartao_dep;
    private String nome_dep;
    private String parentesco;
    private String email_dep;

    @ManyToOne
    @JoinColumn (name = "socio_id", referencedColumnName = "cartao_socio")
    Socio socio;
}
