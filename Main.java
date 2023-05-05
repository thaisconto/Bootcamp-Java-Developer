package Desafios.Triangulo;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

/*
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados) e apresente a mensagem: Perimetro = XX.X
Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura,
mostrando a mensagem: Area = XX.X
Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2
O resultado deve ser apresentado com uma casa decimal.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 valores reais:");
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        if (A >= B & A >=C){ //A é o maior
            if(B + C > A){ //é um triangulo
                double perimetro = A+B+C;
                System.out.println("O perímetro do triângulo é " + String.format("%.1f",perimetro));
            }else{
                double areaTrapezio = ((A + B) * C) / 2;
                System.out.println("Área do trapézio é " + String.format("%.1f",areaTrapezio));
            }
        }

        if (B >= C & B >=A){ //B é o maior
            if(A + C > B){ //é um triangulo
                double perimetro = A+B+C;
                System.out.println("O perímetro do triângulo é " + String.format("%.1f",perimetro));
            }else{
                double areaTrapezio = ((A + B) * C) / 2;
                System.out.println("Área do trapézio é " + String.format("%.1f",areaTrapezio));
            }
        }

        if (C >= B & C >=A){ //C é o maior
            if(B + C > C){ //é um triangulo
                double perimetro = A+B+C;
                System.out.println("O perímetro do triângulo é " + String.format("%.1f",perimetro));
            }else{
                double areaTrapezio = ((A + B) * C) / 2;
                System.out.println("Área do trapézio é " + String.format("%.1f",areaTrapezio));
            }
        }
/* como limitar casa decimal:
// %.2f - pega o argumento e imprime com 2 casas depois da vírgula.
   %n - passa para a próxima linha (equivalente ao println()).
*/

}}
