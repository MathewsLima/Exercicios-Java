/*
 * Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
(inclusive);
 */
package Exercicio17;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        
        int i = 0;
        int numero = 0;
        int x = 0;
        
        
        for(; i < 3; i++){
            System.out.println("Digite um número: ");
            numero = leitorScanner.nextInt();
        
            if(numero >= 10 && numero <= 150){
                x = x + 1;
                } 
        }
         
        System.out.println("De acordo com os 80 valores informados. Houve " + x + " números.");
    }

}
