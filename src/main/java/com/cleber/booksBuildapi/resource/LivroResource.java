package com.cleber.booksBuildapi.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleber.booksBuildapi.domain.Livro;
import com.cleber.booksBuildapi.service.LivroService;

@RestController
@RequestMapping(value = "/livros")
public class LivroResource {

	@Autowired
	private LivroService livroService;
/**	
	@GetMapping
	public ResponseEntity<List<Livro>> listar(){
		List<Livro> livros = new ArrayList<>();
		livros = livroService.todosLivros(id);
		return ResponseEntity.ok().body(livros);
		
	}
	**/
	@GetMapping(value = "/{id}")
	public ResponseEntity<Livro> BuscarId(@PathVariable Integer id){
				Livro livro =  livroService.buscarPorId(id);
		return ResponseEntity.ok().body(livro);
	}	
}
