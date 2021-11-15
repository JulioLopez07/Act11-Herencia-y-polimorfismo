/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shape_act11;

import java.util.Scanner;

/**
 *
 * @author Julio López
 */
public class Circle implements Shape{
    
    double pi = 3.1416;
    static double radio;
    double area;
    double perimetro;

    Circle(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }       

    @Override
    public double getArea() {
        area= pi*(radio*radio);
        return area;
    }

    @Override
    public double getPerimeter() {
        perimetro = 2*pi*radio;
        return perimetro;
    }  
}
