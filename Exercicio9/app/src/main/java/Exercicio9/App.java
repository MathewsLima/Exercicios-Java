/*
 * Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
mês.Considere fixo o juro da poupança em 0,07% a. m;
 */
package Exercicio9;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
       
        Scanner leitorScanner = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Informe um valor a ser depositado ");
        float depositado = leitorScanner.nextFloat();
        //Cálculos
        float rendimento =  (7 * depositado) / 10000 ;
        float rendimentoFinal = rendimento + depositado;
        //Saída
        System.out.print("O valor depositado foi de R$ " + depositado + ", considerando o juros de 0,07% a. m o valor aumentou para R$ " + rendimentoFinal);

    }
}
