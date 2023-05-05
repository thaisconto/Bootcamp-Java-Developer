package Desafios.TaxaImpostoDeRenda;

import java.io.IOException;
import java.util.Scanner;

/*
Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos,
pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em
benefício da população, sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.

Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli.
Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
abaixo de 2000 -> isento
2000,01 - 3000 -> 8%
3000,01 - 4500 -> 18%
acima de 4500,01 -> 28%

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00,
pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.
No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00,
o que resulta em R$ 80.36 no total.

O valor deve ser impresso com duas casas decimais.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double renda = 0.00;
        double imposto = 0.00;
        double diferenca = 0;
        System.out.println("Digite sua renda: ");
        renda = scan.nextDouble();

        if(renda <=2000.00){
            imposto = 0;
        }

        else if(renda >2000.01 & renda <= 3000.00){
            diferenca = renda - 2000;
            imposto = diferenca * 0.08;
        }

        else if (renda >3000.01 & renda <= 4500.00) {
            diferenca = renda - 3000;
            imposto = (1000 * 0.08) + (diferenca * 0.18);
        }

        else{
            diferenca = renda - 4500;
            imposto = (1000 * 0.08) + (1500 * 0.18) + (diferenca * 0.28);

        }

        if(imposto == 0){
            System.out.println("Você está isento do imposto de renda!");
        }
        else{
            System.out.println("Você deve pagar R$" + String.format("%.2f",imposto) + " de imposto de renda!");
        }

    }
}

