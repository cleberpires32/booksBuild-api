package com.cleber.booksBuildapi.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleber.booksBuildapi.domain.Categoria;
import com.cleber.booksBuildapi.domain.Livro;
import com.cleber.booksBuildapi.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	public List<Livro> todosLivros() {
		List<Livro> livros = livroRepository.findAll();
		return livros;
	}

	public Livro buscarPorId(Integer id) {
		Optional<Livro> livroOp = livroRepository.findById(id);
		return livroOp.orElseThrow(
				() -> new ObjectNotFoundException(Livro.class.getName(), "objeto com id" + id + "não encontrado"));

	}

}
