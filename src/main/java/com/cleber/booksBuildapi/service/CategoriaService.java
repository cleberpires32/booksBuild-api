package com.cleber.booksBuildapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleber.booksBuildapi.domain.Categoria;
import com.cleber.booksBuildapi.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria findById(int id){
		Optional<Categoria> optio = categoriaRepository.findById(id);
		return optio.orElse(null);
	}

	public List<Categoria> listaTodas() {
		return categoriaRepository.findAll();
		
	}
}
