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
 public static void main(String[] args) {
       
        Malvado evil = new Malvado(8, 100, "Poh", "Madagascar", "tirar Rayos");
        Heroe hero = new Heroe (10, 100, "Lala", "Vietnam", "Controla la mente");
        System.out.println("Malvado " + evil.getNombre() + " VS heroico " + hero.getNombre());
        System.out.println("Empiezan las peleas :");
        
        while (evil.getEnergia() > 0 && hero.getEnergia() > 0){
        
        int poder_malvado;
        int poder_heroe;
        poder_malvado = (int) Math.floor(Math.random() * (4-1+1) + (1));
          switch(poder_malvado) {
            case 1 -> hero.debilitar(evil.Rayo_violeta());
            case 2 -> hero.debilitar(evil.Rayo_verde());
            case 3 -> hero.debilitar(evil.Rayo_azul());
            case 4 -> hero.debilitar(evil.Rayo_rojo());
          }
           System.out.println(hero.toString() + System.lineSeparator());
          //**********************************************************//
          
          poder_heroe = (int) Math.floor(Math.random() * (4-1+1) + (1));
          switch(poder_heroe) {
            case 1 -> evil.debilitar(hero.Controla_oxipital());
            case 2 -> evil.debilitar(hero.Controla_cerebelo());
            case 3 -> evil.debilitar(hero.Controla_lobulo_temporal());
            case 4 -> evil.debilitar(hero.Lobulo_frontal());
          }
          System.out.println(evil.toString() + System.lineSeparator());
          if(poder_malvado < poder_heroe){
              System.out.println("Gana el malo esta pelea" + System.lineSeparator());
          }
          if(poder_heroe < poder_malvado){
              System.out.println("Gana el bueno esta pelea" + System.lineSeparator());  
          }
          if(poder_heroe == poder_malvado){
              System.out.println("Ambos sufren el mismo daño en esta pelea" + System.lineSeparator());  
          }
          
        }
          if(evil.getEnergia()<=0 && hero.getEnergia()<=0){
              System.out.println("al final murieron ambos ");
          }
          else{
            if(evil.getEnergia()<=0 && hero.getEnergia()>=0){
              System.out.println("murio el malo al final, gana el Heroe");
            }
             if(evil.getEnergia()>=0 && hero.getEnergia()<=0){
              System.out.println("murio el heroe al final, gana el villano");
             }
          }   

         
    }
    
}

