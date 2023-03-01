package filaNoEmbutido;

import estrutaraDadosFila.No;

//Código refatorado para nó embutido e utilização de generics
public class Main {
    public static void main(String args[]){

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println("-----------");

        System.out.println("Método dequeue: retira primeiro da fila: " + minhaFila.dequeue());

        System.out.println("Minha nova fila: " + minhaFila);

        System.out.println("-----------");

        System.out.println("Método enqueue, adicionar elemento quinto");

        minhaFila.enqueue("quinto");

        System.out.println(minhaFila);

        System.out.println("-----------");

        System.out.println("Méotodo first: mostrar primeiro elemento da fila");

        System.out.println(minhaFila.first());

    }
}
