/*
 * A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um
algoritmo que receba um valor de uma compra e mostre o valor das prestações;
 */
package Exercicio10;
import java.util.Scanner;
public class App {
    

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
        //Entradad de dados
        System.out.println("Informe o valor da compra R$");
        float preco = leitorScanner.nextFloat();
        //Cálculos
        float prestacoes = preco / 5;
        //Saída de dados
        System.out.println("A compra no valor de R$ " + preco + " fica em 5 parcelas de R$ " + prestacoes);

    }
}
