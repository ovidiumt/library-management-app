package com.myapps.librarymanagement.dao;

import com.myapps.librarymanagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Book, Integer> {
}
