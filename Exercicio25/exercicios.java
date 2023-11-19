import java.util.Scanner;

public class exercicios {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = leitorScanner.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = leitorScanner.nextInt();

        if (n1 == n2){
            System.out.print("Os números são iguais");
            } else {
                if(n1 > n2){
                    System.out.print("O número " + n1 + " é maior, e assim os números são diferentes.");
                } else {
                    if(n1 < n2){
                        System.out.print("O número " + n2 + " é maior, e assim os números são diferentes");
                    }
                }
            }
    }
}
