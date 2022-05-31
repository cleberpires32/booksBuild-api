package com.cleber.booksBuildapi.resource;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

import com.cleber.booksBuildapi.domain.Livro;
import com.cleber.booksBuildapi.dto.LivroDTO;
import com.cleber.booksBuildapi.service.LivroService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/livros")
public class LivroResource {

	@Autowired
	private LivroService livroService;

	@GetMapping
	public ResponseEntity<List<LivroDTO>> listar(){
		return ResponseEntity.ok().body(livroService.todosLivros());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Livro> BuscarId(@PathVariable Integer id){
				Livro livro =  livroService.buscarPorId(id);
		return ResponseEntity.ok().body(livro);
	}
	
	@GetMapping(value = "/{id_cat}/categoria")
	public ResponseEntity<List<LivroDTO>> buscarLivrosPorIdCategoria(@PathVariable Integer id_cat){
		List<LivroDTO> livros = livroService.buscarPorIdCategoria(id_cat);
		return ResponseEntity.ok().body(livros);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<LivroDTO> alterar(@PathVariable Integer id,@Valid @RequestBody LivroDTO body){
		LivroDTO dto = livroService.alterar(id, body);
		return ResponseEntity.ok().body(dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		livroService.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping
	public ResponseEntity<Livro> create(@Valid @RequestBody Livro body){
		UriComponents uri2 = ServletUriComponentsBuilder.fromCurrentRequest().path("/categoria").build();
		String idCategoria = uri2.getQueryParams().get("categoria").get(0);
		
		Livro livro = livroService.criarLivro(body, idCategoria);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(livro.getId()).toUri();
		return ResponseEntity.created(uri).body(livro);
	}
}
