/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lnarvaezr.a04;
import java.util.Scanner;
/**
 *
 * @author Vianey_Narváez
 */
public class SPP2LNarvaezRA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int opEntrada;
    Scanner teclado = new Scanner(System.in);
    double angulo, tan, sen, cos;
    
    System.out.println("Menu Trigonometrico");
    System.out.println("Introduzca la opción deseada");
    System.out.println("1. Calcular seno");
    System.out.println("2. Calcular coseno");
    System.out.println("3. Calcular tangente");
    System.out.println("4. Salir");
    opEntrada = teclado.nextInt();
    
    switch (opEntrada){
        case 1:
            System.out.println("Bienvenido a la calculadora de senos");
            angulo=pedirAngulo();
            angulo=Math.toRadians(angulo);
            sen= Math.sin(angulo);
            System.out.println("El seno del angulo es "+sen);
            break;
        case 2:
            System.out.println("Bienvenido a la calculadora de cosenos");
            angulo=pedirAngulo();
            angulo=Math.toRadians(angulo);
            cos=Math.cos(angulo);
            System.out.println("El coseno del angulo es "+cos);
            break;
        case 3:
            System.out.println("Bienvenido a la calculadora de tangentes");
            angulo=pedirAngulo();
            angulo=Math.toRadians(angulo);
            tan=Math.tan(angulo);
            System.out.println("La tangente del angulo es "+tan);
            break;
        default:
            System.out.println("Adios!");
    }
    
    }
    
       static double pedirAngulo(){
        double angulo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el angulo");
        angulo=teclado.nextDouble();
        return angulo;
       } 
}


