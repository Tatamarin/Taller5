package com.taller5.demo.InterfacesService;

import java.util.List;
import java.util.Optional;

import com.taller5.demo.Entity.Libro;


public interface ILibroService {

    public List<Libro>listarLibro();
    public Optional<Libro>listarLOptional(int Id);
    public int saveLibro(Libro L);
    public void deleteLibro(Libro Id);

}
