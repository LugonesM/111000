/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.vacas;

import java.util.Date;

/**
 *
 * @author mel
 */
public class Pelicula {
    private int anioEstreno;
    private boolean disponible;
    private int duracionEnMin;
    private Date fechaIngreso;
    private String nombre;
    private String nombreOriginal;
    private Calificacion calif;
    private Genero gen;

    public Pelicula() {
    }

    public Pelicula(int anioEstreno, boolean disponible, int duracionEnMin, Date fechaIngreso, String nombre, String nombreOriginal, Calificacion calif, Genero gen) {
        this.anioEstreno = anioEstreno;
        this.disponible = disponible;
        this.duracionEnMin = duracionEnMin;
        this.fechaIngreso = fechaIngreso;
        this.nombre = nombre;
        this.nombreOriginal = nombreOriginal;
        this.calif = calif;
        this.gen = gen;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public int getDuracionEnMin() {
        return duracionEnMin;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreOriginal() {
        return nombreOriginal;
    }

    public Calificacion getCalif() {
        return calif;
    }

    public Genero getGen() {
        return gen;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setDuracionEnMin(int duracionEnMin) {
        this.duracionEnMin = duracionEnMin;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreOriginal(String nombreOriginal) {
        this.nombreOriginal = nombreOriginal;
    }

    public void setCalif(Calificacion calif) {
        this.calif = calif;
    }

    public void setGen(Genero gen) {
        this.gen = gen;
    }
    
    
    
    
}
