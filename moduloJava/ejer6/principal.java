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
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangulo t1=new Triangulo(4,3);
        System.out.println("base de t1 : "+t1.getBase());
        System.out.println("base de t1 : "+t1.getAltura());
        System.out.println("el area del circulo es : "+t1.calcularArea());
        
        Rectangulo r1=new Rectangulo(4,3);
        System.out.println("base de r1 : "+r1.getBase());
        System.out.println("base de r1 : "+r1.getAltura());
        System.out.println("el area del circulo es : "+r1.calcularArea());
        
        Circulo c1=new Circulo(3);
        System.out.println("radio de c1 : "+c1.getRadio());
        System.out.println("el area del circulo es : "+c1.calcularArea());
        
        Cuadrado cua1=new Cuadrado(3);
        System.out.println("lado del cua1 : "+cua1.getLado());
        System.out.println("el area del circulo es : "+cua1.calcularArea());
       
    }
    
}
