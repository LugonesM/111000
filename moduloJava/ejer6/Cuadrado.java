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
public class Cuadrado implements calculo{
    private float lado;

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public float calcularArea() {
       float resultado;
       resultado=(float) (lado*lado);
       return resultado;
    }
}
