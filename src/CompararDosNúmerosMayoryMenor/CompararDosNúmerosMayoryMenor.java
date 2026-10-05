/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CompararDosNúmerosMayoryMenor;
import java.util.Scanner;

public class CompararDosNúmerosMayoryMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println("El número mayor es: " + num1);
            System.out.println("El número menor es: " + num2);
        } else if (num2 > num1) {
            System.out.println("El número mayor es: " + num2);
            System.out.println("El número menor es: " + num1);
        } else {
            System.out.println("Ambos números son iguales.");
        }

        entrada.close();
    }
}

