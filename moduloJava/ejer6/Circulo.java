/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvl.proyectgeometria;

/**
 *
 * @author mel
 */
public class Circulo implements calculo{
    public float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    @Override
    public float calcularArea() {
       float resultado;
       resultado=(float) (radio*radio*3.14);
       return resultado;
    }
    
}
