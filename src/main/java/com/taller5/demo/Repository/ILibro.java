package com.taller5.demo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taller5.demo.Entity.Libro;

@Repository
public interface ILibro extends JpaRepository<Libro, Long> {   
    
}