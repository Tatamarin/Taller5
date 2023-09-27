package com.taller5.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taller5.demo.Entity.Autor;
import com.taller5.demo.InterfacesService.IAutorSevice;
import com.taller5.demo.Repository.IAutor;


@Service
public class AutorService implements IAutorSevice {
   @Autowired
    private IAutor data;
    @Override
    public List<Autor> listarAutor() {
        return (List<Autor>)data.findAll();
    }

    @Override
    public Optional<Autor> listarAutorId(Long Id) {
        return data.findById(Id);
    }

    @Override
    public int saveAutor(Autor a) {
        
        int res=0;
        Autor autores=data.save(a);
        if (!autores.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void deleteAutor(Long Id) {
        data.deleteById(Id);
        
    }
    
}
