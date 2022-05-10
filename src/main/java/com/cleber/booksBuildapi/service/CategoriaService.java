package com.cleber.booksBuildapi.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cleber.booksBuildapi.domain.Categoria;
import com.cleber.booksBuildapi.dto.CategoriaDTO;
import com.cleber.booksBuildapi.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria findById(int id){
		Optional<Categoria> optio = categoriaRepository.findById(id);
		return optio.orElseThrow( () -> new ObjectNotFoundException(Categoria.class.getName(), "Objeto com id: "+id+" não encontrado"));
	}

	public List<Categoria> listaTodas() {
		return categoriaRepository.findAll();
		
	}
	
	public Categoria create(Categoria cat) {
		//cat.setId(null);
		return categoriaRepository.save(cat);
	}

	public Categoria alterar(Integer id, CategoriaDTO dto) {
		Categoria cat = categoriaRepository.getById(id);
		cat.setDescricao(dto.getDescricao());
		cat.setNome(dto.getNome());
		return categoriaRepository.save(cat);
	}

	public void delete(Integer id) {
		categoriaRepository.deleteById(id);
	}

}
