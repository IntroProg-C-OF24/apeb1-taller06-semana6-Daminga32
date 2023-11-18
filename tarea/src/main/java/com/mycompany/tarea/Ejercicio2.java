package com.mycompany.tarea;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        double lado1;
        double lado2;
        double lado3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la longitud del primer lado: ");
        lado1 = teclado.nextDouble();
        System.out.println("Ingrese la longitud del segundo lado: ");
        lado2 = teclado.nextDouble();
        System.out.println("Ingrese la longitud del tercer lado: ");
        lado3 = teclado.nextDouble();
        if(lado1 == lado2 && lado2 == lado3 && lado1 == lado3){
            System.out.println("Es un triangulo equilatero.");
            if(lado1 == lado2 && lado2 != lado3 || lado1 == lado3 && lado3 != lado2){
                System.out.println("El triangulo es isosceles.");
                if(lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
                    System.out.println("Es un triangulo escaleno");
                    if(lado1 + lado2 < lado3 || lado2 + lado3 < lado1 || lado1 + lado3 < lado2 ){
                        System.out.println("No es un triangulo");
                        
                    }
                }
            }
        }
    }
}
