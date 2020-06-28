 */
package com.mvl.proyectgeometria;

/**
 *
 * @author mel
 */
public class Triangulo {
    private float base;
    private float altura;

    public Triangulo() {
    }

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
      
    public float calcularArea(){
    float resultado;
    resultado=(this.base*this.altura)/2;
    return resultado;  
    }
    
    
}
