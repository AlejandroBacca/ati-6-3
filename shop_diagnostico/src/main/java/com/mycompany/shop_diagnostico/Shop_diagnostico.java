
package com.mycompany.shop_diagnostico;

import Class.Producto;
import java.util.Scanner;

public class Shop_diagnostico {

    public static void main(String[] args) {
        Producto productos[] = new Producto[5]; 
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        int opc  = 1;
        
        while(i<productos.length && opc == 1){
            System.out.println("ingrese nombre de producto: ");
            String nombre = entrada.next();
            System.out.println("ingrese precio de producto: ");
            double precio = entrada.nextDouble();
            System.out.println("ingrese cantidad de producto: ");
            int cantidad = entrada.nextInt();
            Producto producto = new Producto(nombre, precio, cantidad);
            productos[i] = producto;
            i++;
            System.out.println("¿Desea ingresar otro producto? (1 = SI, 2 = NO): ");
            opc = entrada.nextInt();
         }
        
         for(int j = 0; j<productos.length; j++){
             System.out.println(productos[j]);
        }
    }
    
}
