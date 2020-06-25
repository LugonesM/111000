package com.mvl.proyectoLapicera;

/**
 *
 * @author mel
 */
public class Regla {
    private String marca;
    private int longitud;
    private String material;

    
    /*gerenadores*/
    public Regla(String marca, int longitud, String material) {
        this.marca = marca;
        this.longitud = longitud;
        this.material = material;
    }

    public Regla() {
    }

    
    /*getters y setters */
    public String getMarca() {
        return marca;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getMaterial() {
        return material;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    
    public String mostrar() {
        return "Regla : " + " marca : " + marca + ", longitud : " + longitud + ", material : " + material;
    }  
}
