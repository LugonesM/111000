package com.mvl.proyectoLapicera;

/**
 *
 * @author mel
 */
public class Lapicera {
    private String marca;
    private int modelo;
    private String color;

    public Lapicera(String marca, int modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    
     public Lapicera(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }
     
     public String mostrarPorPantalla() {
         return "la marca es : " + marca + ", el modelo es : " + modelo + ", el color es : " + color ;
    }

     
     
    /* @Override
    public String toString() {
        return "Lapicera{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    */
    
}
