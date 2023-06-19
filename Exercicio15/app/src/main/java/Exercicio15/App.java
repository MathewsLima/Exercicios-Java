/*
 * Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
 */
package Exercicio15;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = leitorScanner.nextInt();

        if(numero < 100){
            System.out.println("O número é menor que 100");
        } else {
            if(numero < 200){
                System.out.println("O número está entre 100 e 200");
            } else{
                System.out.println("O valor é maior que 200");
            }
        }


    }
}
