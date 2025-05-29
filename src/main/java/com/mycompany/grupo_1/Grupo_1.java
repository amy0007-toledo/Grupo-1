/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grupo_1;

/**
 *
 * @author DAVID
 */
import java.util.Scanner;
public class Grupo_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar menú de opciones
            System.out.println("Menú de opciones:");
            System.out.println("1. Generar serie de Fibonacci hasta un número dado");
            System.out.println("2. Calcular la suma de los primeros N números naturales");
            System.out.println("3. Simular un cajero automático que valide el dinero disponible");
 System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el número límite para la serie Fibonacci: ");
                    int n = sc.nextInt();
                    int a = 0, b = 1;
                    System.out.print("Serie Fibonacci: ");
                    while (a <= n) {
                        System.out.print(a + " ");
                        int temp = a;
                        a = b;
                        b = temp + b;
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Ingrese un número natural N: ");
                    int N = sc.nextInt();
                    if (N <= 0) {
                    System.out.println("Por favor, ingrese un número natural mayor que 0.");
                    } else {
                      int suma = N * (N + 1) / 2;
                      System.out.println("La suma de los primeros " + N + " números naturales es: " + suma);
                    }
 break;

                case 3:
                    int sld = 1000;
                  System.out.println("Welcome al cajero de Amy");
                  System.out.println("Ingrese el monto a retirar:");
                  int rtr = sc.nextInt();
                  if(rtr>sld){
                  System.out.println("Fondos insuficientes,su monto de retiro es superior a nuestro saldo");
                  }else if (rtr<=0){
                    System.out.println("El monto no es valido");
                  }else{
                     sld=sld-rtr;
                     System.out.println("Su retiro fue exitoso,El nuevo saldo es de:"+sld);
                  }

                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 0);
    }
}
