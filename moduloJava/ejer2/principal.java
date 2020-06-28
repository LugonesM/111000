package com.mvl.proyectgeometria;

/**
 *
 * @author mel
 */
public class principal {

    public static void main(String[] args) {
        
        Triangulo t1=new Triangulo(4,3);
        System.out.println("base de t1 : "+t1.getBase());
        System.out.println("base de t1 : "+t1.getAltura());
        //t1.setAltura(5);
        // System.out.println("base de t1 nueva : "+t1.getAltura());
        //System.out.println(t1.getBase()*t1.getAltura()/2);
        System.out.println(t1.calcularArea());
    } 
}
