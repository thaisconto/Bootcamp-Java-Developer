package Desafios.Animal;
/*
Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo,
da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido,
através das três palavras fornecidas.
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura
acima, com todas as letras minúsculas.
Imprima o nome do animal correspondente à entrada fornecida.
 */
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  throws IOException {
        Scanner scan = new Scanner(System.in);

        String palavra1, palavra2, palavra3;

        System.out.println("Digite primeira característica: ");
        palavra1 = scan.nextLine();
        System.out.println("Digite segunda característica: ");
        palavra2 = scan.nextLine();
        System.out.println("Digite terceira característica: ");
        palavra3 = scan.nextLine();

        if (palavra1.equals("vertebrado")) {

            if(palavra2.equals("ave")){

                if(palavra3.equals("carnivoro")){
                    System.out.println("O animal é águia");

                }else{
                    System.out.println("O animal é pomba"); }

            } else { //se não for ave
                if(palavra2.equals("mamifero"))
                    if(palavra3.equals("onivoro")) {
                        System.out.println("O animal é homem");
                    }else{
                        System.out.println("O animal é vaca");
                    }

            }
        }

        else{ //se não for vertebrado
            if(palavra2.equals("inseto")){
                if(palavra3.equals("hematofago")){
                    System.out.println("O animal é pulga");
                }else{
                    System.out.println("O animal é lagarta");
                }
            }else{ //se não for inseto
                if(palavra3.equals("hematofago")){
                    System.out.println("O animal é sanguessuga");
                }else{
                    System.out.println("O animal é minhoca");
                }
            }
        }

    }}
