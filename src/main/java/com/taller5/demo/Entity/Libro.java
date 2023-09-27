package com.taller5.demo.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "Libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 
    private Long libroId;

    @Column(name = "ISBN", length = 100, nullable = false)
    private String ISBN;

    @Column(name = "nombreLibro", length = 255, nullable = false)
    private String nombreLibro;

    @Column(name = "precioPublico", nullable = false)
    private Double precioPublico;

    public Libro() {
    }

    // Constructor personalizado
    public Libro(String ISBN, String nombreLibro, Double precioPublico) {
        this.ISBN = ISBN;
        this.nombreLibro = nombreLibro;
        this.precioPublico = precioPublico;
    }

    // Getters y setters
    public Long getLibroId() {
        return libroId;
    }

    public void setLibroId(Long libroId) {
        this.libroId = libroId;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public Double getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(Double precioPublico) {
        this.precioPublico = precioPublico;
    }
}