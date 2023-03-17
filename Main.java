package Desafios.dragao;
/*
Daenerys é a khaleesi dos Dothraki. Juntamente com Drogon, eles vão atrás do Tyrion,
para tentar dominar Westeros. Ela possui, além do seu dragãozinho, um rastreador que mede o nível
de energia de qualquer ser vivo. Todos os seres com o nível menor ou igual a 8000,
ela considera como se fosse um inseto. Quando passa deste valor, que foi o caso do Drogon,
ela se espanta e grita “Mais de 8000”. Baseado nisso, utilize a mesma tecnologia e analise o
nível de energia dos seres vivos.
A primeira linha contém um número inteiro C relativo ao número de casos de teste.
Em seguida, haverá C linhas, com um número inteiro N (100 <= N <= 100000) relativo ao nível
de energia de um ser vivo.
Para cada valor lido, imprima o texto correspondente.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int numeroDeCasos = 0;
        int contador = 1;
        int poderDeLuta = 0;

        System.out.println("Digite o número de casos: ");
        numeroDeCasos = scan.nextInt();

        do{
            System.out.println("Digite o poder de luta: ");
            poderDeLuta = scan.nextInt();

            if(poderDeLuta>8000) System.out.println("Mais de 8000!");
            else System.out.println("Inseto!");

            contador++;

        }while(contador <= numeroDeCasos);
    }
}
