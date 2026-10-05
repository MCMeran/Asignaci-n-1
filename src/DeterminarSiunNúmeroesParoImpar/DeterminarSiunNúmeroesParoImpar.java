/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeterminarSiunNúmeroesParoImpar;

import java.util.Scanner;
public class DeterminarSiunNúmeroesParoImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es PAR.");
        } else {
            System.out.println("El número " + numero + " es IMPAR.");
        }

        entrada.close();
    }
}

