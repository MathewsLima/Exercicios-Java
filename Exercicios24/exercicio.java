import java.util.Scanner;


/*
 * Faça um algoritom que receba "N" números e mostre positivo, negativo ou zero para cada número
 */
public class exercicio {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);
               
        // Entrada de dados
        int i = 0;
        
        for(; i < 3; i++){
            System.out.println("Digite um número");
            int numero = leitorScanner.nextInt();

            if (numero > 0){
                System.out.println("O número é positivo");
            } else {
                if (numero < 0){
                    System.out.println("O número é negativo");
                 } else {
                System.out.println("O número é igual a 0");
            }
                
            }   
     }
    }
}
