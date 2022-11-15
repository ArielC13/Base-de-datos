package com.objetos;
public class Triangulo {
    private int Lado1;
    private int Lado2;
    private int Lado3;

    public Triangulo(){
        this.Lado1 = 10;
        this.Lado2 = 10;
        this.Lado3 = 15;
    
    }

    public Triangulo(int newLado1, int newLado2,int newLado3){
        this.Lado1 = newLado1;
        this.Lado2 = newLado2;
        this.Lado3 = newLado3;
    }

    int Perimetro(){
        int suma = Lado1 + Lado2 + Lado3;
        return suma;
    }

    public int getLado1(){
        return Lado1;
    }

    public int getLado2(){
        return Lado2;
    }

    public int getLado3(){
        return Lado3;
    }

    public void setLado1(int newLado1){
        this.Lado1 = newLado1;
    }

    public void setLado2(int newLado2){
        this.Lado2 = newLado2;
    }

    public void setLado3(int newLado3){
        this.Lado3 = newLado3;
    }

    public String toString(){
        return this.Lado1 + " " + this.Lado2 + " " + this.Lado3;
    }
    
}
