package com.mvl.matematicas;

import javax.swing.Icon;
import javax.swing.JOptionPane;


public class Matematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    
      
        int g=-1;
        while(g<0){
            String input=JOptionPane.showInputDialog("ingresa tu nombre:");
            if(input.length()>0){
                g++;
                JOptionPane.showMessageDialog(null,"oky  " + input);
            }
            else{
                Icon icon = null;
                JOptionPane.showMessageDialog(null,"daaale poneeelo: ","ok",JOptionPane.ERROR_MESSAGE,icon);
            }
        }
        
        //<html><b style=\color:red ; font-siza:20px;\
   
        String info1 = JOptionPane.showInputDialog("Ingrese el primer numero (num1)");
        int numero1=Integer.parseInt(info1);
        String info2 = JOptionPane.showInputDialog("Ingrese el segundo numero (num2)");
        int numero2=Integer.parseInt(info2);
        
        Calculadora calcu;
        calcu = new Calculadora(numero1,numero2);
      
        
        
       // System.out.println("El resultado de la suma de ambos numeros es:"+calcu.sumar());
        JOptionPane.showMessageDialog(null,"El resultado de la suma de ambos numeros es: " + calcu.sumar());
        JOptionPane.showMessageDialog(null,"El resultado de la resta de ambos numeros es:"+calcu.restar());
        JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion de ambos numeros es:"+calcu.multiplicar());
        
        if(calcu.dividir()==Float.POSITIVE_INFINITY || calcu.dividir()==Float.NEGATIVE_INFINITY){
            System.out.println("ERROR!");
        }else{
            JOptionPane.showMessageDialog(null,"El resultado de la division de ambos numeros es:" + calcu.dividir());
        }
    }
    
}
