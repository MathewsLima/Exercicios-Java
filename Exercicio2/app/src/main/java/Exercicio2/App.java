package Exercicio2;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
       
        Scanner leitor = new Scanner(System.in);
        
        //Entrada de dados
        System.out.println("Digite um número:");
        int primeiroNumero = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = leitor.nextInt();
        
        //Calculo dos Dados
        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multi = primeiroNumero * segundoNumero;
        int divi = primeiroNumero / segundoNumero;
        
        //Saída dos dados
        System.out.println(primeiroNumero + " + " + segundoNumero + " = " + soma);
        System.out.println(primeiroNumero + " - " + segundoNumero + " = " + subtracao);
        System.out.println(primeiroNumero + " * " + segundoNumero + " = " + multi);
        System.out.println(primeiroNumero + " / " + segundoNumero + " = " + divi);
        
       
    }
}
