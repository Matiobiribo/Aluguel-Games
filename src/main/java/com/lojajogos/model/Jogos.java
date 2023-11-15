package com.lojajogos.model;

import java.util.Objects;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



// classe

@Entity
public class Jogos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable = false)
	private String nome;
	
	@Column (nullable = false)
	private String genero;
	
	@Column (nullable = false)
	private float preco;

	
	
// getters and setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	
	
// Esse trecho de código implementa o método hashCode() na classe Java Jogos, gerando um valor numérico com base no atributo id
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	
	
// Substitui o método equals() na classe Java Jogos para comparar se dois objetos da classe são considerados iguais
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogos other = (Jogos) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
