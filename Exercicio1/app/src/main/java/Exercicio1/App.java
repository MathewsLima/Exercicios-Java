package Exercicio1;

import java.util.Scanner;

public class App {
    
       
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in); 
        
        System.out.println("Digite um número:");
        int numero1 = leitorScanner.nextInt();
        
        System.out.println("Digite outro número");
        int numero2 = leitorScanner.nextInt();
        
        int soma = numero1 + numero2; 
        
        System.out.println("A soma do número " + numero1 + " mais " + numero2 + " é igual a: " + soma );
         
        
    }
}
