package br.edu.ifsul.cstsi.projeto005.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Mensalidade")
@Table (name = "mensalidades")
public class Mensalidade {
    @Id @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private int data_mens;
    private double valor_mens;
    private int data_pgto;
    private double juros_mens;
    private double valor_pago;
    private boolean quit_mens;
    @ManyToMany(mappedBy = "mensalidades")
    List<Socio> socios;
}
