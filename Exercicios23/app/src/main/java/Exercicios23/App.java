/*
 * Faça um algoritmo que receba um número e mostre uma mensagem caso este número
sege maior que 80, menor que 25 ou igual a 40.
 */
package Exercicios23;
import java.util.Scanner;

public class App {
          
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
               
        // Entrada de dados
        
        System.out.print("Digite um valor: ");
        int numero = leitorScanner.nextInt();
        
        //Analise dos dados
        if (numero == 40){
            System.out.print("O número é igual a 40");
        } else {
            if(numero > 80){
                System.out.print("O número é maior que 80");
            } else {
                if(numero < 25){
                    System.out.print("O número é menor que 25");
                } else {
                    
                }
            }
        }
        
        
    }
}
