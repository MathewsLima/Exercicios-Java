/*
 * Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
 */
package Exercicio13;
import java.util.Scanner;
public class App {
    

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

            //Entrada de dados

        System.out.print("Digite um número:");
        float numero = leitorScanner.nextFloat();

            //Condiçõs de saída de dados

        if(numero > 10){
            System.out.println("O número " + numero + " é maior que 10.");
        } else {
            System.out.println("O número " + numero + " não é maior que 10");
        }
    }
}
