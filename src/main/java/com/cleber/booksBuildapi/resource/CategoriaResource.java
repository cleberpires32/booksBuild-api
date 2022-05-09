package com.cleber.booksBuildapi.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleber.booksBuildapi.domain.Categoria;
import com.cleber.booksBuildapi.dto.CategoriaDTO;
import com.cleber.booksBuildapi.service.CategoriaService;
import com.fasterxml.jackson.annotation.JsonIgnore;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService categoriaService;

	@JsonIgnore
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Integer id) {
		Categoria categoria = categoriaService.findById(id);
		return ResponseEntity.ok().body(categoria);
	}

	@GetMapping
	public ResponseEntity<List<CategoriaDTO>> todas(){
		List<Categoria> list = categoriaService.listaTodas();
		List<CategoriaDTO> listDto = list.stream().map(obj -> new CategoriaDTO(obj)).collect(Collectors.toList());
		 
		 return ResponseEntity.ok().body(listDto);
	}
}
