package com.taller5.demo.InterfacesService;

import java.util.List;
import java.util.Optional;

import com.taller5.demo.Entity.Autor;

public interface IAutorSevice {
    
    public List<Autor>listarAutor();
    public Optional<Autor>listarAutorId(Long Id);
    public int saveAutor(Autor a);
    public void deleteAutor (Long Id);
 
}
