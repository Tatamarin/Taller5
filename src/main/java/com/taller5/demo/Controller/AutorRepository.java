package com.taller5.demo.Controller;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taller5.demo.Entity.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {   
}
