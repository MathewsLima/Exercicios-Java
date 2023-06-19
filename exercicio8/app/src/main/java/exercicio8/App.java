/*
 * Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um 
 * valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar 
 * e também a quantidade de dólares disponíveis com o usuário;
 */
package exercicio8;
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
    Scanner leitoScanner = new Scanner(System.in);
    
    System.out.println("Digite quantos dólares você possue: ");
    float real = leitoScanner.nextFloat();
    System.out.println("Digite a cotação do real:");
    float dolar = leitoScanner.nextFloat();

    float cotacao = dolar / real;

    System.out.println("De acordo com a cotação informada você possu R$" + cotacao);


    }
}
