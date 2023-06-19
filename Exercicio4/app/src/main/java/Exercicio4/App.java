/*
 Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo 
e o total de vendas efetuadas por ele no mês (em dinheiro). 
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
 */
package Exercicio4;

import java.util.Scanner;

public class App {
       
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        //Entrada de Dados.
        System.out.println("Digite o nome do vendedor:");
        String nomeVen = leitor.next();
        System.out.println("Digite o sálario base:");
        float sBase = leitor.nextFloat();
        System.out.println("Digite o total de vendas:");
        int vendas = leitor.nextInt();
        
        //Calculo dos dados.
        float comissao = (15 * vendas) / 100;
        float salarioFinal = sBase + comissao;
        
        //Saída dos dados.
        System.out.println("O vendedor " + nomeVen + " com o salário base"
                + " de R$ " + sBase + " com base na quantidade de vendas"
                        + " esse mês o salário final será de R$" + salarioFinal);
    }
}
