/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shape_act11;

/**
 *
 * @author PP
 */
public class Square implements Shape {
    static double lado;
    double area, perimetro;
    
    Square(double lado){
        this.lado = lado;
    }
    
    @Override
    public double getArea() {
        area = lado * lado;
        return area;
    }

    @Override
    public double getPerimeter() {
        perimetro = lado + lado + lado + lado;
        return perimetro;
    }

    
}
