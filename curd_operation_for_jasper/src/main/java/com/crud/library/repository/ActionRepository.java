package com.crud.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.library.model.Book;

public interface ActionRepository extends JpaRepository<Book, Integer>{
}
