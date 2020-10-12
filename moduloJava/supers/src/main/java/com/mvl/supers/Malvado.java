/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.supers;

/**
 *
 * @author mel
 */
public class Malvado extends Supers_x{
    private int indiceMaldad; 

    public Malvado() {
    }

    public Malvado(int indiceMaldad,int energia, String nombre, String pais_origen, String habilidad_ppal) {
        super(energia,nombre,pais_origen,habilidad_ppal);
        this.indiceMaldad = indiceMaldad;
    }

 
    public int getIndiceMaldad() {
        return indiceMaldad;
    }

    public void setIndiceMaldad(int indiceMaldad) {
        this.indiceMaldad = indiceMaldad;
    }
    
    
    
    
    
}
