/*
 * Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
Recuperação (media entre 5.1 a 6.9);.
 */
package Exercicio16;
import java.util.Scanner;
public class App {
   

    public static void main(String[] args) {
       Scanner leitorScanner =  new Scanner(System.in);

       System.out.println("Digite o nome do aluno:");
       String nome = leitorScanner.next();
       System.out.println("Digite a primeira nota");
       float primeiraNota = leitorScanner.nextFloat();  
       System.out.println("Digite a segunda nota"); 
       float segundaNota = leitorScanner.nextFloat();
       System.out.println("Digite a terceira nota"); 
       float terceiraNota = leitorScanner.nextFloat();
       
       float media = (primeiraNota + segundaNota + terceiraNota) / 3;

       if (media >= 7){
        System.out.println("O aluno "+ nome + " com a média de " + media + " está aprovado");
       } else{
        } if (media <= 5) {
            System.out.println("O aluno " + nome + " com a média de " + media + " está reprovado");
        } else{
            if (media < 7){
            System.out.println("O aluno " + nome + " com a média de " + media + " está de recuperação!");
            }
        }
       
    }
}
