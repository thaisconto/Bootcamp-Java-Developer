package Desafios.fibonacci;
/*
A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci.
Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores.
Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.
O arquivo de entrada contém um valor inteiro N (0 < N < 46).
Os valores devem ser mostrados na mesma linha, separados por um espaço em branco.
Não deve haver espaço após o último valor.
 */

import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int contador = 1;
        int fibonacci = 0;

        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        System.out.println("Sequencia Fibonacci = ");

        if(numero<=2) {
            do {
                System.out.print(" " + fibonacci);
                fibonacci++;
                contador++;
            } while (contador <= numero);
        }

            else{
                System.out.print(0 + " " + 1);

                contador = 2;
                int atual = 1;
                int proximo = 0;
                int anterior = 1;

                do {
                        System.out.print(" " + atual);

                        proximo = atual + anterior;
                        anterior = atual;
                        atual = proximo;

                        contador++;

                    }while(contador<numero);
            }


    }
}
