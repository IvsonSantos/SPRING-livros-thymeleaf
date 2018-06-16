package com.ivson.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivson.spring.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

	List<Livro> findByAutor(String autor);

	List<Livro> findByTitulo(String titulo);

	Livro findByIsbn(String isbn);
}
