/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.shape_act11;

import java.util.Scanner;
/**
 *
 * @author Julio Lopez
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Opcion a realizar: \n"
                + "1.- Área\n"
                + "2.- Perímetro");
        opcion = entrada.nextInt();
        do{
            switch (opcion){
                case 1:
                    System.out.println("----Área----\n"
                        + "Elige la figura: ");
                    opciones();
                    opcion = entrada.nextInt();
                        switch(opcion){
                            case 1:
                                do{
                                    System.out.println("----Circulo----");
                                    System.out.println("Ingresa el valor del radio: ");
                                    Circle.radio = entrada.nextDouble();
                                    Circle c = new Circle(Circle.radio);
                                    System.out.println("El área del circulo es de: " + c.getArea());
                                    System.out.println("Desea volver realizar el calculo: \n"
                                    + "1.Si   2.-No");
                                    opcion = entrada.nextInt();
                                }while (opcion == 1);
                                if (opcion == 2){continue;}
                                break;
                            case 2:
                                do{
                                    System.out.println("----Triangulo----");
                                    System.out.println("Ingresa el valor de la base: ");
                                    Triangle.base = entrada.nextDouble();
                                    System.out.println("Ingresa el valor de la altura: ");
                                    Triangle.altura = entrada.nextDouble();
                                    Triangle t = new Triangle(Triangle.base, Triangle.altura);
                                    System.out.println("EL área del triangulo es de: " + t.getArea());
                                    System.out.println("Desea volver realizar el calculo: \n"
                                    + "1.Si   2.-No");
                                    opcion = entrada.nextInt();
                                }while (opcion == 1);
                                if (opcion == 2){continue;}
                                break;
                            case 3:
                                do{
                                System.out.println("----Cuadrado----");
                                System.out.println("Ingresa el valor del lado: ");
                                Square.lado = entrada.nextDouble();
                                Square s = new Square(Square.lado);
                                System.out.println("El área del cuadrado es de: " + s.getArea());
                                System.out.println("Desea volver realizar el calculo: \n"
                                    + "1.Si   2.-No");
                                    opcion = entrada.nextInt();
                                }while (opcion == 1);
                                if (opcion == 2){continue;}
                                break;
                            default:
                                System.out.println("----Opcion invalidad!----");
                                break;
                            }
                        break;
                case 2:
                System.out.println("----Perímetro----\n"
                        + "Elige la figura: ");
                opciones();
                opcion = entrada.nextInt();
                    switch(opcion){
                        case 1:
                            do{
                                System.out.println("----Circulo----");
                                Circle c = new Circle(Circle.radio);
                                System.out.println("Ingresa el valor del radio: ");
                                Circle.radio = entrada.nextDouble();
                                System.out.println("El perímetro del circulo es de: " + c.getPerimeter());
                                System.out.println("Desea volver realizar el calculo: \n"
                                    + "1.Si   2.-No");
                                opcion = entrada.nextInt();
                            }while (opcion == 1);
                            if (opcion == 2){continue;}
                            break;
                        case 2:
                            do{
                                System.out.println("----Triangulo----");
                                System.out.println("Ingresa el valor del lado: ");
                                Triangle.base = entrada.nextDouble();
                                Triangle t = new Triangle(Triangle.base,0);
                                System.out.println("EL área del triangulo es de: " + t.getPerimeter());
                                System.out.println("Desea volver realizar el calculo: \n"
                                    + "1.Si   2.-No");
                                opcion = entrada.nextInt();
                            }while (opcion == 1);
                            if (opcion == 2){continue;}
                            break;
                        case 3:
                            do{
                                System.out.println("----Cuadrado----");
                                System.out.println("Ingresa el valor del lado: ");
                                Square.lado = entrada.nextDouble();
                                Square s = new Square(Square.lado);
                                System.out.println("El área del cuadrado es de: " + s.getPerimeter());
                                System.out.println("Desea volver realizar el calculo: \n"
                                    + "1.Si   2.-No");
                                opcion = entrada.nextInt();
                            }while (opcion == 1);
                            if (opcion == 2){continue;}
                            break;
                        
                        default:
                            System.out.println("----Opcion invalidad!----");
                            break;
                        }
                    break;
                default:
                    System.out.println("----Opcion invalidad!!----");
                    break;  
            } 
        System.out.println("Desea volver realizar un calculo: \n"
                    + "1.Si   2.-No");
        opcion = entrada.nextInt();
        }while (opcion == 1);
    }
    public static String opciones(){
        System.out.println("1.-Circulo\n"
                + "2.-Triangulo\n"
                + "3.-Cuadrado");
        return null;
   }
}
