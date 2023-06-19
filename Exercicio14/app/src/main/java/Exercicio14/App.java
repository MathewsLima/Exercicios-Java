/*
 * Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
 */
package Exercicio14;
import java.util.Scanner;
public class App {
    

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int primeiroNum = leitorScanner.nextInt();
        System.out.println("Digite outro número");
        int segundoNum = leitorScanner.nextInt();

        if (primeiroNum > segundoNum){
            System.out.println("Entre os dois valore digitados o valor: " + primeiroNum + " é o maior!");
        }   else {  
            System.out.println("Entre os dois valores digitados o valor: " + segundoNum + " é o maior!");
        }
    }
}
