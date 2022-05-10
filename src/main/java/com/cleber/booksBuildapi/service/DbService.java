package com.cleber.booksBuildapi.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleber.booksBuildapi.domain.Categoria;
import com.cleber.booksBuildapi.domain.Livro;
import com.cleber.booksBuildapi.repository.CategoriaRepository;
import com.cleber.booksBuildapi.repository.LivroRepository;

@Service
public class DbService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		Categoria categoria = new Categoria(null, "Informatica", "Livro de Informatica");
		Categoria categoria2 = new Categoria(null,"Engenharia", "Livro de Engenharia");
		Livro livro = new Livro( "Clean Code", "Robert Martin", "lorem ipsum",categoria);
		Livro livro2 = new Livro("Historia JS", "Perteson Lucca", "Cat cout",categoria);
		Livro livro3 = new Livro("Engenharia civil", "Marcos Luc", "texto de engenharia",categoria2);
		
		categoria.getListaLivro().addAll(Arrays.asList(livro,livro2,livro3));
		
		this.categoriaRepository.saveAll(Arrays.asList(categoria,categoria2));
		this.livroRepository.saveAll(Arrays.asList(livro,livro2,livro3));
	}
}
