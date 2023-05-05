package Desafios.QuitandaFrutas;

import java.util.Scanner;

/*
Seu Zé está vendendo frutas com a seguinte tabela de preços:
Morango: R$ 2,50/Kg (até 5kg), R$ 2,20/Kg (acima de 5kg)
Maçã: R$ 1,80/Kg (até 5kg), R$ 1,50/Kg (acima de 5kg)

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
receberá ainda um desconto de 10% sobre este total.
Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças
adquiridas e escreva o valor a ser pago pelo cliente.

Como entrada, você recebera a quantidade em kg de morangos e a quantidade em kg de maçãs.
A saída será o valor a ser pago pelo cliente, conforme a tabela de preços da quintanda do seu Zé.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int morangos = 0;
        int macas = 0;
        double valorMorango = 0;
        double valorMaca = 0;
        double precoTotal = 0;

        System.out.println("Quantos quilos de morango deseja comprar?");
        morangos = scan.nextInt();

        System.out.println("Quantos quilos de maçã deseja comprar?");
        macas = scan.nextInt();

        if(morangos<=5){
            valorMorango = morangos * 2.5;
        } else{
            valorMorango = morangos * 2.2;
        }

        if(macas<=5){
            valorMaca = macas * 1.8;
        } else{
            valorMaca = macas * 1.5;
        }

        precoTotal = valorMorango + valorMaca;

        if (morangos+macas >=8 || precoTotal > 25){
            precoTotal = precoTotal * 0.9;
        }

        System.out.println("Preço morango: " + valorMorango);
        System.out.println("Preço maçã: " + valorMaca);
        System.out.println("Preço total: " + precoTotal);
    }

}

