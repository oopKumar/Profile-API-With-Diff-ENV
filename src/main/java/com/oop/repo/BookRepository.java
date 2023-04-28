package com.oop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oop.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity,Integer> {

}
