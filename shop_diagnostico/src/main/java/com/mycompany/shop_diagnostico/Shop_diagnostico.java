
package com.mycompany.shop_diagnostico;

import Class.Producto;
import java.util.Scanner;

public class Shop_diagnostico {

    public static void main(String[] args) {
        Producto productos[] = new Producto[5]; 
        Scanner entrada = new Scanner(System.in);
        
        
        for(int i = 0; i<productos.length; i++){
            System.out.println("ingrese nombre de producto");
            String nombre = entrada.next();
            System.out.println("ingrese precio de producto");
            double precio = entrada.nextDouble();
            System.out.println("ingrese cantidad de producto");
            int cantidad = entrada.nextInt();
            Producto producto = new Producto(nombre, precio, cantidad);
            productos[i] = producto;
        }
         for(int i = 0; i<productos.length; i++){
             System.out.println(productos[i]);
        }
    }
    
}
