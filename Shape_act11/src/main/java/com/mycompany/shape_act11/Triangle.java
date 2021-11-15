/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shape_act11;

/**
 *
 * @author PP
 */
public class Triangle implements Shape {
    
    static double base, altura;
    double area;
    double perimetro;
    
    Triangle(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void setArea(){
        this.area = area;
    }
    
    @Override
    public double getArea() {
        area = (base * altura)/2;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimetro = base * 3;
        return perimetro;
    }

    
    
}
