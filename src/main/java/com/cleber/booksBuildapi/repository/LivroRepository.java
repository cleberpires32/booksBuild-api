package com.cleber.booksBuildapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleber.booksBuildapi.domain.Categoria;
import com.cleber.booksBuildapi.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

	public List<Livro> findByCategoria(Categoria categoria);
}
