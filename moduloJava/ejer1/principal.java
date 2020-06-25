package com.mvl.proyectoLapicera;

/**
 *
 * @author mel
 */
public class principal {

    public static void main(String[] args) {
        //clase lapicera
        System.out.println("Lapicera MVL");
        Lapicera lapi1=new Lapicera("Bic",3,"Azul");
        Lapicera lapi2=new Lapicera("faver",032,"Azul");
        Lapicera lapi3=new Lapicera();
        
        lapi3.setMarca("pilot");
        lapi3.setModelo(78);
        lapi3.setColor("rojo");
        
        System.out.println("la lapicera 3 tiene color: " + lapi3.getColor() + " , su marca es: " + lapi3.getMarca() + " y color num : " + lapi3.getModelo() );   
        System.out.println(lapi3.mostrarPorPantalla());
        System.out.println(lapi1.mostrarPorPantalla());
        System.out.println(lapi2.mostrarPorPantalla());
        
        //clase regla
        Regla reg1=new Regla("faver",30,"plastico");
        Regla reg2=new Regla("faver",60,"plastico");
        Regla reg3=new Regla("faver",90,"madera");
        
        System.out.println(reg1.mostrar());
        System.out.println(reg2.mostrar());
        System.out.println(reg3.mostrar());
        
    }
    
}
