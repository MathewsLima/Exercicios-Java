/*
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
mesmo;
 */
package Exercicio12;
import java.util.Scanner;
public class App {
    

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe o preço de custo do automóvel R$");
        float precoCusto = leitorScanner.nextFloat();

        float imposto = (45 * precoCusto) / 100;
        float precoImposto = precoCusto + imposto;
        float distribuidor = (28 * precoImposto) / 100;
        float valorFinal = precoImposto + distribuidor;

        System.out.println("O valor final do automóvel é de R$ " + valorFinal);



    }
}
