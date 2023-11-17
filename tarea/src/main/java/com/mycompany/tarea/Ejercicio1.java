package com.mycompany.tarea;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        double precio;
        double precio2;
        double envio;
        double subtotal;
        double desc;
        double totalcompra;
        double iva;
        double totiva;
        double fin;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio del primer producto: ");
        precio = teclado.nextDouble();
        System.out.println("Ingrese el precio del segundo producto: ");
        precio2 = teclado.nextDouble();
        System.out.println("Ingrese el costo del envio: ");
        envio = teclado.nextDouble();
        subtotal=precio*precio2;
        iva = (subtotal * 1.21);
        totiva =  subtotal + iva;
        System.out.println("El subtotal de su compra va a ser de: "+subtotal);
        System.out.println("El subtotal mas impuesto va a ser de: "+totiva);
        System.out.println("El impuesto aplicado es de: "+iva);
        if(totiva > 1000){
            desc = (totiva * 20)/100;
            totalcompra = totiva - desc;
            System.out.println("El total de su compra va a ser de: "+totalcompra);
            if(totiva == 1000){
                desc = (totiva * 15)/100;
                totalcompra = totiva - desc;
                System.out.println("El total de su compra va a ser de: "+totalcompra);
                if(totalcompra > 5000){
                    System.out.println("El total de su compra va a ser: "+totalcompra);
                }else{
                    fin = totalcompra + envio;
                    System.out.println("El total de la compra va a ser de: "+fin);
                }
                        
            }
            
        }
        
        
        
       
    }
}
