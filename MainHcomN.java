package Desafios.HcomNtermos;
/*
Neste desafio, faça um programa que calcule o valor de H com N termos.
Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
A entrada consiste em um número inteiro positivo.
Na saída será impresso o valor que representa a soma dos termos.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] Args) {

        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int contador = 1;
        double H = 0.0;
        double divisao = 0;

        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        do {
            divisao = 1.0/contador;
            H = H + divisao;

            contador++;

        }while(contador<=numero);

        System.out.println("Valor de H é: " + String.format("%.0f", H));
    }
}
