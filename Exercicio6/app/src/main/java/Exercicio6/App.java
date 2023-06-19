/*
 * Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a 
 * variável A passe a possuir ovalor da variável B e a variável B passe a possuir o valor da 
 * variável A.Apresentar os valores trocados;
*/
package Exercicio6;
import java.util.Scanner;
public class App {
    

    public static void main(String[] args) {
        Scanner leitortScanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int valB = leitortScanner.nextInt();
        System.out.println("Digite o valor de B:");
        int valA = leitortScanner.nextInt();

        System.out.println("O valor de A é: " + valA + " e o valor de B é: " + valB);
    }
}
