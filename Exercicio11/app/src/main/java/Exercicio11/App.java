/*
 * Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário
 */
package Exercicio11;
import java.util.Scanner;
public class App {
    

    public static void main(String[] args) {
       Scanner leitorScanner = new Scanner(System.in);
        
        //Entrada de dados

       System.out.println("Informe o preço de custo R$");
       float precoCusto = leitorScanner.nextFloat();
       System.out.println("Informe quantos qual vai ser a % de lucro deste produto:");
       int porcentagem = leitorScanner.nextInt();

        //Cálculos

       float vendaAumento = (precoCusto * porcentagem) / 100;
       float venda = vendaAumento + precoCusto;

        //Saída de dados

       System.out.println("O valor de venda é de R$ " + venda);
    
    }
}
