/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superx;

import vista.Pantalla_prueba;

/**
 *
 * @author 111mil
 */
public class SuperX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Pantalla pantalla1=new Pantalla();
        pantalla1.setVisible(true);*/
        
        Pantalla_prueba pantalla=new Pantalla_prueba();
        pantalla.setVisible(true);
        
        /*Malvado malvado = new Malvado("Magma Man", "Ecuador", "Domina el fuego", 9);
        Heroe heroe = new Heroe("Freeze Boy", "Suecia", "Poderes frios", 8);
        System.out.println("Batalla: " + malvado.getNombre()+" ("+malvado.getEnergia()+" energia) " + " vs. " + heroe.getNombre()+" ("+heroe.getEnergia()+" energia) ");
        
        int poder_malvado;
        int poder_heroe;
        while (malvado.getEnergia() > 0 && heroe.getEnergia() > 0) {
            poder_malvado = (int) Math.floor(Math.random() * (4 - 1 + 1) + (1));
            switch (poder_malvado) {
                case 1:
                    heroe.debilitar(malvado.atacarDeMalvado_1());
                    break;
                case 2:
                    heroe.debilitar(malvado.atacarDeMalvado_3());
                    break;
                case 3:
                    heroe.debilitar(malvado.atacarDeMalvado_4());
                    break;
                case 4:
                    heroe.debilitar(malvado.atacarDeMalvado_2());
                    break;
                default:
                    System.out.println("ERROR DE OPCION!!!");
                    break;
            }
            poder_heroe = (int) Math.floor(Math.random() * (4 - 1 + 1) + (1));
            switch (poder_heroe) {
                case 1:
                    malvado.debilitar(heroe.atacarDeHeroe_4());
                    break;
                case 2:
                    malvado.debilitar(heroe.atacarDeHeroe_3());
                    break;
                case 3:
                    malvado.debilitar(heroe.atacarDeHeroe_2());
                    break;
                case 4:
                    malvado.debilitar(heroe.atacarDeHeroe_1());
                    break;
                default:
                    System.out.println("ERROR DE OPCION!!!");
                    break;
            }
            System.out.println(malvado.toString());
            System.out.println(heroe.toString());
        }
        if ((malvado.getEnergia() < heroe.getEnergia()) && heroe.getEnergia() >= 0) {
            System.out.println("FREEZEBOY HA VENCIDO A MAGMAMAN");
        } else if ((malvado.getEnergia() > heroe.getEnergia()) && malvado.getEnergia() >= 0) {
            System.out.println("MAGMAMAN HA VENCIDO A FREEZEBOY");
        } else {
            System.out.println("AMBOS PERECIERON");
        }*/

    }

}
