package com.taller5.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.taller5.demo.Entity.LibroAutoreado;
import com.taller5.demo.InterfacesService.ILibroAutoreadoService;

@Service
public class LibroAutoreadoService implements ILibroAutoreadoService{

    @Override
    public List<LibroAutoreado> listarLibroAutoreados() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarLibroAutoreados'");
    }

    @Override
    public Optional<LibroAutoreado> listarLAOptional(int Id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarLAOptional'");
    }

    @Override
    public int saveLibroAutoreado(LibroAutoreado La) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveLibroAutoreado'");
    }

    @Override
    public void deleteLibroAutoreado(LibroAutoreado Id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteLibroAutoreado'");
    }
    
}
