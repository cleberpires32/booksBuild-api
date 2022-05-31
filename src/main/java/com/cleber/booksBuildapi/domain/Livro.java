package com.cleber.booksBuildapi.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Livro implements Serializable{

	private static final long serialVersionUID = 1L;
			
	private Integer id;
	@NotEmpty(message = "O campo NOME_AUTOR é requerido")
	@Length(min = 3, max = 50, message = "O campo NOME_AUTOR deve ter entre 3 e 50 caracteres.")
	private String nome_autor;
	@NotEmpty(message = "O campo TITULO é requerido")
	@Length(min = 3, max = 50, message = "O campo TITULO deve ter entre 3 e 50 caracteres.")
	private String titulo;
	@NotEmpty(message = "O campo TEXTO é requerido")
	@Length(min = 10, max = 2000000, message = "O campo TEXTO deve ter entre 10 e 2000000 caracteres.")
	private String texto;
	
	private Categoria categoria;
	
	public Livro() {}
	
	public Livro(String nome_autor, String titulo, String texto,Categoria categoria) {
		super();
		this.nome_autor = nome_autor;
		this.titulo = titulo;
		this.texto = texto;
		this.categoria = categoria;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name = "categoria")
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getNome_autor() {
		return nome_autor;
	}
	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return id == other.id;
	}


}
