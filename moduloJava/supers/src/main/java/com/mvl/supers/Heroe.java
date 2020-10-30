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
public class Heroe extends Supers_x {
   private int indiceBondad; 

    public Heroe() {
    }

    public Heroe(int indiceBondad,int energia, String nombre, String pais_origen, String habilidad_ppal) {
        super(energia,nombre,pais_origen,habilidad_ppal);
        this.indiceBondad = indiceBondad;
    }

  
   
    public int getIndiceBondad() {
        return indiceBondad;
    }

    public void setIndiceBondad(int indiceBondad) {
        this.indiceBondad = indiceBondad;
    }
   
   public int Controla_oxipital(){
    int controla_oxipital = 4;
    if(this.indiceBondad>4){ 
        controla_oxipital = 6;
        System.out.print("---El heroe ataca con Control oxipital, resta 6---");
    }
    else{
    System.out.print("---El heroe ataca con Control oxipital, resta 4---");
    }
    return controla_oxipital;
}
   public int Controla_cerebelo(){
       int cont_cerebel=3;
       System.out.print("---El heroe ataca con Control cerebelo, resta 3---");
       return cont_cerebel;
   }
   
   public int Controla_lobulo_temporal(){
       int lobulo_temporal = 4;
       System.out.print("---El heroe ataca con Control lobulo temporal, resta 4---");
       return lobulo_temporal;
   }
   
   public int Lobulo_frontal(){
       int lobulo_frontal = 5;
       System.out.print("---El heroe ataca con Lobulo frontal, resta 5---");
       return lobulo_frontal;
   }
    
}
