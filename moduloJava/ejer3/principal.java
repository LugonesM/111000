/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboardInput=new Scanner(System.in);
        float uno;
        float dos;
        
        System.out.println("ingrese num1(decimales detras de coma):  ");
        uno=keyboardInput.nextFloat();
        System.out.println("ingresaste:  " + uno);
        
        System.out.println("ingrese num2(decimales detras de coma):  ");
        dos=keyboardInput.nextFloat();
        System.out.println("ingresaste:  " + dos);
        
        
        calculadora c1;
        c1 = new calculadora(uno,dos);

       System.out.println("suma:  " + c1.sumar());
       
       System.out.println("resta:  " + c1.restar());
       
       System.out.println("multiplicar:  " + c1.multiplicar());
       
       System.out.println("dividir:  " + c1.dividir());
  
    }
    
}
