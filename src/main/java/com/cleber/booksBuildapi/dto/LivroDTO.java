package com.cleber.booksBuildapi.dto;

import com.cleber.booksBuildapi.domain.Livro;

public class LivroDTO {

	private Integer id;
	private String nome_autor;
	private String titulo;
	private String texto;
	
	public LivroDTO() {
	}
	
	public LivroDTO(Livro obj) {
		this.id = obj.getId();
		this.nome_autor = obj.getNome_autor();
		this.titulo = obj.getTitulo();
		this.texto = obj.getTexto();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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

	
}
