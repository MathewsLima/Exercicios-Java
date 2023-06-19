/*
 * Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
No final informar o nome do aluno e a sua média (aritmética);
 */
package exercicio5;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       Scanner leitorScanner = new Scanner(System.in);

       System.out.println("Digite o nome do aluno:");
       String nome = leitorScanner.next();
       System.out.println("Digite a primeira nota:");
       float primeiraNota = leitorScanner.nextFloat();
       System.out.println("Digite a segunda nota:");
       float segundaNota = leitorScanner.nextFloat();
       System.out.println("Digite a terceira nota:");
       float terceiraNota = leitorScanner.nextFloat();

       float media = (primeiraNota + segundaNota + terceiraNota) / 3;

       System.out.println("O aluno " + nome + " teve a media de " + media);

    }
}
