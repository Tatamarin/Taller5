package com.taller5.demo.InterfacesService;

import java.util.List;
import java.util.Optional;


import com.taller5.demo.Entity.LibroAutoreado;

public interface ILibroAutoreadoService {
 
    public List<LibroAutoreado>listarLibroAutoreados();
    public Optional<LibroAutoreado>listarLAOptional(int Id);
    public int saveLibroAutoreado(LibroAutoreado La);
    public void deleteLibroAutoreado (LibroAutoreado Id);

}
