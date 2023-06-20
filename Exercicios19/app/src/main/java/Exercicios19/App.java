/*
 * Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou
mulher. No final informe total de homens e de mulheres;
 */
package Exercicios19;
import java.util.Scanner;
public class App {
    

    public static void main(String[] args) {
       Scanner leitorScanner = new Scanner(System.in);

       int i = 0;
       int masculino = 0;
       int feminino = 0;
       int erro = 0;
       
       
       for(; i < 3; i++){
        System.out.println("Informe seu nome:");
        String nome = leitorScanner.next();
        System.out.println("Por favor informe seu sexo: M - Masculino F - Feminino");
        char sexo = leitorScanner.next().charAt(0);

        if(sexo == 'M' || sexo == 'm' ){
            masculino = masculino + 1;
        } else {
            if (sexo == 'F' || sexo == 'f'){
                feminino = feminino + 1;
            }   else {
                erro = erro + 1;
                System.out.println("Por favor informe um identificador correto!");

            }
        }

       }
       System.out.println("Houve " + masculino + " homens e " + feminino + " mulheres.");
    }
}
