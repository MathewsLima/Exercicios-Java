/*
 * Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
 */
package Exercicio18;
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        int i = 0;
        for (;i < 3; i++){
            System.out.print("Por favor informe sua idade: ");
            int idade = leitorScanner.nextInt();

            if(idade >= 18){
                System.out.println("Com base na idade informada você é maior de idade.");
            } else {
                System.out.println("Com base na idade informada você é menor de idade.");
            }
            
    }
    }
}
