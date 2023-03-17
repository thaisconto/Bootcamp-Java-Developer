package Desafios.positivosMedia;

/*
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados,
com um dígito após o ponto decimal.
A entrada contém 6 números que podem ser valores inteiros ( int ) ou de ponto flutuante ( float ou double ).
Pelo menos um destes números será positivo.
O primeiro valor de saída é a quantidade de valores positivos.
A próxima linha deve mostrar a média dos valores positivos digitados.
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int contador = 0;
        double mediaPositivos = 0;
        int quantidadePositivos =0;
        double numero =0;
        double soma =0;

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextDouble();

            if(numero>=0) {
                quantidadePositivos++;
                soma = soma + numero;}

            contador++;

        }while (contador < 6);

        System.out.println("Quantidade de números positivos: " + quantidadePositivos);

        mediaPositivos = soma/quantidadePositivos;
        System.out.println("A média é: " + String.format("%.1f", mediaPositivos));

        }}