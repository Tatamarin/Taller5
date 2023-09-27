package com.taller5.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.taller5.demo.Entity.LibroAutoreado;

@Repository
public interface ILibroAutoreado extends JpaRepository<LibroAutoreado, Long> {   
    
}