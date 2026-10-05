/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TabladeMultiplicar;
    import java.util.Scanner;

public class TabladeMultiplicar {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
        int numero = entrada.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        entrada.close();
    }
}

