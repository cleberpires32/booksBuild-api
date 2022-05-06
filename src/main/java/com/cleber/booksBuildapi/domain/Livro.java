package com.cleber.booksBuildapi.domain;

import java.util.Objects;

public class Livro {

	private int id;
	private String nome_autor;
	private String titulo;
	private String texto;
	
	public Livro(int id, String nome_autor, String titulo, String texto) {
		super();
		this.id = id;
		this.nome_autor = nome_autor;
		this.titulo = titulo;
		this.texto = texto;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
