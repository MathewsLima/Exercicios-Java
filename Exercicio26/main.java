import java.util.Scanner;

public class main {
    public static void main(String[] args) {
     Scanner leitoScanner = new Scanner(System.in);
     
     System.out.print("Digite um número entre 1 e 5: ");
     int numero = leitoScanner.nextInt();

     if(numero == 1){
        System.out.print("Um");
     } else{
        if (numero == 2){
        System.out.print("Dois");
        } else {
            if (numero == 3){
                System.out.print("Três");
            } else {
                if (numero == 4){
                    System.out.print("Quatro");
                } else {
                    if (numero == 5){
                        System.out.print("Cinco");
                    } else{
                        System.out.print("Número inválido.");
                    }
                }
            }
        } 
    }
 }  
}