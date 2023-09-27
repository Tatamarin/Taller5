package com.taller5.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.taller5.demo.Entity.Libro;
import com.taller5.demo.InterfacesService.ILibroService;

@Service
public class LibroService implements ILibroService{

    @Override
    public List<Libro> listarLibro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarLibro'");
    }

    @Override
    public Optional<Libro> listarLOptional(int Id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarLOptional'");
    }

    @Override
    public int saveLibro(Libro L) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveLibro'");
    }

    @Override
    public void deleteLibro(Libro Id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteLibro'");
    }
    
}
