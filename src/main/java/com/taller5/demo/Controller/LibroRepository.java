package com.taller5.demo.Controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taller5.demo.Entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{
    
}
