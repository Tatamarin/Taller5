package com.taller5.demo.Entity;

import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "libroautoreado")
public class LibroAutoreado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "libroautoreadoid")
    private Long libroautoreadoid;

    @Column(name = "fecha", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha;

    @Column(name = "observaciones", length = 255)
    private String observaciones;

    public LibroAutoreado() {
    }

  
    public LibroAutoreado(Date fecha, String observaciones) {
        this.fecha = fecha;
        this.observaciones = observaciones;
    }

  
    public Long getLibroAutoreadoId() {
        return libroautoreadoid;
    }

    public void setLibroAutoreadoId(Long libroautoreadoid) {
        this.libroautoreadoid = libroautoreadoid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


    
  

}
