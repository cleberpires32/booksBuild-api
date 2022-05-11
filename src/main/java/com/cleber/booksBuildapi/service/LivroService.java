package com.cleber.booksBuildapi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleber.booksBuildapi.domain.Livro;
import com.cleber.booksBuildapi.dto.LivroDTO;
import com.cleber.booksBuildapi.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	public List<LivroDTO> todosLivros() {
		List<Livro> livros = livroRepository.findAll();
		List<LivroDTO> livroDto = livros.stream().map(obj -> new LivroDTO(obj)).collect(Collectors.toList());
		return livroDto;
	}

	public Livro buscarPorId(Integer id) {
		Optional<Livro> livroOp = livroRepository.findById(id);
		return livroOp.orElseThrow(
				() -> new ObjectNotFoundException(Livro.class.getName(), "objeto com id" + id + "não encontrado"));

	}

	public LivroDTO alterar(Integer id, LivroDTO dto) {
		Livro op = buscarPorId(id);

		op.setNome_autor(dto.getNome_autor());
		op.setTitulo(dto.getTitulo());
		op.setTexto(dto.getTexto());

		Livro livro = livroRepository.save(op);
		
		return new LivroDTO(livro);
	}

	public void delete(Integer id) {
		buscarPorId(id);
		livroRepository.deleteById(id);
	}

	public Livro criarLivro(Livro body) {
		return livroRepository.save(body);
	}

}
