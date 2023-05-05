package Desafios.EspacosEVogais;

import java.util.Scanner;

/*
Jorginho é professor do primário de uma determinada escola. Ele tem 100.000 alunos e precisa criar
um programa que verifica quantos espaços em branco e quantas vogais existem em uma determinada string
de entrada que os alunos entregaram na avaliação final. Ajude-o a realizar essa tarefa antes que o
tempo para entrega-la no fim do semestre acabe!

 A entrada será uma frase no formato de string
 A saída deverá retornar quantos espaços em branco e quantas vogais existem na
 determinada string, conforme exemplo abaixo:
"Esse desafio foi facil" - Espacos em branco: 3   Vogais: 10
 “Navegar nas aguas do teu mar” - Espacos em branco: 5 Vogais: 11
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scan.nextLine();

        //split separa a sting em palavras com regex
        String[] fraseSplit = frase.split(" ");

        //criando uma char com as vogais
        char[] Vogais = {'a', 'e', 'i', 'o', 'u'};

        //como a fraseSplit está separada em palavras, o espço em branco será palavras -1
        int espacosEmBranco = fraseSplit.length - 1, quantVogais = 0;

        //percorrendo a string em cada item -> palavra
        for (String item : fraseSplit) {
            //adicionando um contado i com length (número de cacateres dentro da string)
            for (int i = 0; i < item.length(); i++){
                //charAt retorna o caractere da posição i
                char c = item.charAt(i);
                //converter o item c em minusculo, para comprar com as vogais contidas na char
                char cMinusculo = Character.toLowerCase(c);
                //usando método contem (criado abaixo) para percorrer char vogal
                if (contem(Vogais, cMinusculo))
                    quantVogais++;
            }
        }

        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }

    //criando método contém: uma comparação dentro da char vogais

    //vetor: é a minha char vogais, comparação é o meu item caractere c na posição i
        private static boolean contem (char vetor[], char comparacao){

        boolean flag = false;

        //percorrer meu vetor vogais e retornar true se a comparação for positiva
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == comparacao)
                flag = true;
        }

        return flag;


    }

}