package com.cleber.booksBuildapi.dto;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.cleber.booksBuildapi.domain.Livro;

public class LivroDTO {

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
