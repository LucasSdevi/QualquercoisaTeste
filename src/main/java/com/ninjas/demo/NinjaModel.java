package com.ninjas.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cadastro_de_ninjas")
public class NinjaModel {

    @Id
    @GeneratedValue
     private Long id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel() {
    }

    public NinjaModel(Long id, String nome, String email, int idade) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.idade = idade;
}    




}


