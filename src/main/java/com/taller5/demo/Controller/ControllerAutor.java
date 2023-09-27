package com.taller5.demo.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.taller5.demo.Entity.Autor;
import com.taller5.demo.InterfacesService.IAutorSevice;



@Controller
public class ControllerAutor {

    @Autowired
    private IAutorSevice service;
    @GetMapping({"/index", "/"})
    public String mostrarIndex() {
        return "/index";
    }

    @PostMapping({"/autores"})
    public String listarAutores(Model model) {
        List<Autor>autores=service.listarAutor();
        model.addAttribute("autores", autores);

        return "indexAutores";

    }
  
   
    @GetMapping({"/newA"})
    public String agregarAutores(Model model) {
  
        model.addAttribute("autores", new Autor());
        return "formAutores";
    }

    @PostMapping({"/saveautores"})
    public String guardarAutor(@Validated Autor a, Model model) {
        service.saveAutor(a);
        return "redirect:indexAutores";
    }
    
    @GetMapping({"/editar/{Id}"})
    public String formularioEditar(@PathVariable Long Id, Model modelo){
        Optional<Autor>autores=service.listarAutorId(Id);
        modelo.addAttribute("autores", autores);
        return "crear-autores";
    }
    

    
    @GetMapping({"/Eliminarautores/{id}"})
    public String eliminarAutor(Model model,@PathVariable Long Id){
        service.deleteAutor(Id);
        return "redirect:/autores";
    }
}