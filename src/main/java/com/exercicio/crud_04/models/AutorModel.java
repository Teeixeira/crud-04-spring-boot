package com.exercicio.crud_04.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_autor")
public class AutorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "autor")
    private String autor;
    @Column(name = "nacionalidade")
    private String nacionalidade;
    private LocalDate dataNascimento;

    public AutorModel() {
    }

    public AutorModel(Long id, String autor, String nacionalidade, LocalDate dataNascimento) {
        this.id = id;
        this.autor = autor;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
