package tp_diagnostico;

import java.util.Scanner;

public class Tp_diagnostico {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese el numero 1: ");
        int num1 = num.nextInt();
        System.out.println("Ingrese el numero 2. ");
        int num2 = num.nextInt();
        System.out.println("Las operaciones suma, resta, multiplicacion y" + 
                " division equivalen a las opciones: 1, 2, 3 y 4");
        System.out.println("Ingrese operacion deseada: ");
        int opcionOperacion = num.nextInt();
        switch(opcionOperacion){
            case 1:
                int resultadoSuma = num1 + num2;
                System.out.println("Resultado de la suma: " + resultadoSuma);
                break;
            case 2: 
                int resultadoResta = num1 - num2;
                System.out.println("Resultado de la resta: " + resultadoResta);
                break;
            case 3:
                int resulMult = num1 * num2;
                System.out.println("Resultado de multiplicacion: " + resulMult);
                break;
            case 4:
                int resulDiv = num1/num2;
                System.out.println("Resultado division: " + resulDiv);
                break;
        }
    }
    
}
