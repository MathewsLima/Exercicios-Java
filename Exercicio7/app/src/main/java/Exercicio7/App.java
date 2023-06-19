/*
 * Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;
 */
package Exercicio7;
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
    Scanner leitortScanner = new Scanner(System.in);
    
    System.out.println("Digite a temperatura em Celsius que será convertida em Fahrenheit");
    int Celsius = leitortScanner.nextInt();

    float Fahrenheit = (9 * Celsius + 160) / 5;

    System.out.println("Convertendo " + Celsius + "°C em Fahrenheit fica " + Fahrenheit + "°F");
    }
}
