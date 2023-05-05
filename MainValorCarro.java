package Desafios.valorCarro;

/*
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor
e dos impostos (aplicados ao custo de fábrica).
O gerente de uma loja de carros gostaria de um programa para calcular o preço de um carro
novo para os clientes. Você receberá o custo de fábrica e as porcentagens referentes ao
distribuidor e os impostos e deverá escrever programa para ler esses valores e imprimir
o valor final do carro.
Você recebera três valores inteiros que representam o custo de fábrica,
as porcentagens do distribuidor e os impostos.
Como saída, teremos o valor final do preço de um carro novo.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //entradas:
        System.out.println("Informe o custo de fabricação: ");
        int custoFabrica = scan.nextInt();
        System.out.println("Informe a porcentagem do distribuidor: ");
        int porcentagemDistribuidor = scan.nextInt();
        System.out.println("Informe o percentual de impostos: ");
        int PercentualImpostos = scan.nextInt();

        int custoConsumidor;
        int Distribuidor;
        int ValorImpostos;
        int carroNovo;

        //porcentagens
        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = (custoFabrica * PercentualImpostos) / 100;

        //valor carro novo
        carroNovo = custoFabrica + Distribuidor + ValorImpostos;


        System.out.println("Valor do carro novo para cliente deverá ser: " + carroNovo);
    }
}
