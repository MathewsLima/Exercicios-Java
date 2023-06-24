/*
 *Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta
ou não para cumprir o serviço militar obrigatório. Informe os totais;
 */
package Exercicio21;

import java.util.Scanner;

public class App {
   

    public static void main(String[] args) {
    Scanner leitorScanner = new Scanner (System.in);

    int i = 0;
    int apto = 0;
    for(; i < 3; i++){
        System.out.print("Informe o nome: ");
        String nome = leitorScanner.next();
        System.out.print("Informe o sexo: M - Masculino ou F - Feminino. ");
        char sexo = leitorScanner.next().charAt(0);    
        System.out.print("Informe a idade: ");
        int idade = leitorScanner.nextInt();
        System.out.print("Informe a saúde: R - Ruim, B - Bom ou E - Excelente.");
        char saude = leitorScanner.next().charAt(0);

        if(sexo == 'm' || sexo == 'M' || sexo == 'F' || sexo == 'f'){
            if(idade >= 18 ){
                apto = apto + 1;
                if(saude == 'b' || saude == 'B' || saude == 'E' || saude == 'e'){
                    System.out.println(nome + " está apto para cumprir o serviço militar!");
                } else{
                    System.out.println(nome + " não está apto para cumpri o serviço militar! ");
                }
             } else{
                System.out.println(nome + " não está apto para cumprir o serviço militar!");
             }
         }
        }
    System.out.println("O total de aptos foi de: " + apto);
    }
}
