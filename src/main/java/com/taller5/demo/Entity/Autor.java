package com.taller5.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "Autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long autorId;

    @Column(name = "nombre", length = 255, nullable = false)
    private String nombre;

    @Column(name = "ciudad", length = 255, nullable = false)
    private String ciudad;
    
    
    public Autor(Long autorId, String nombre, String ciudad) {
        this.autorId = autorId;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

  
    public Long getAutorId() {
        return autorId;
    }

    public void setAutorId(Long autorId) {
        this.autorId = autorId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
}
