package com.mvl.matematicas;


public class Calculadora {
    private int num1;
    private int num2;
              
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int sumar(){
        int suma;
        suma=num1+num2;
        return suma;
    }
    
    public int restar(){
        int resta=num1-num2;
        return resta;
    }
    
    public int multiplicar(){
        int multi=num1*num2;
        return multi;
    }
    
    public float dividir(){
        float divi;
        divi=(float)num1/num2;
        return divi;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
    
}
