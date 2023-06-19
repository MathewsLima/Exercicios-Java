/*
Escreva um algoritmo para determinar o consumo médio de um automóvel
sendo fornecida a distância total percorrida pelo automóvel e o
total de combustível gasto;
*/

package Exercicio3;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a distancia percorrida: ");
        float kmPercorrido = leitor.nextFloat();
        System.out.println("Quanto combustível foi gasto? ");
        float valorComb = leitor.nextFloat();
        
        float media = kmPercorrido / valorComb;
        
        
        System.out.println("A média de consumo foi de: " + media + " km/l");
               
        
    }
}
