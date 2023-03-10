package queue;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String args[]){

        Queue<Carro> queueCarros = new LinkedList<Carro>();

        //método add para adicionar itens a fila
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println("Minha fila: " + queueCarros);
        System.out.println("--------");

        //retorna true se conseguiu adicionar
        //da um erro se não conseguir adicionar
        System.out.println("Método add, adicionar Peugeot: " + queueCarros.add(new Carro("Peugeot")));
        System.out.println("Nova Fila: " + queueCarros);
        System.out.println("--------");

        //método element: Pega o elemento da cabeça da fila sem remover
        System.out.println("Elemento da cabeça da fila com método element: " + queueCarros.element());
        System.out.println("--------");

        //método offer: adiciona um item a fila
        //Retorna false se não conseguir
        System.out.println("Adiconar Renault com método offer: " + queueCarros.offer(new Carro("Renault")));
        System.out.println("Nova fila: " + queueCarros);
        System.out.println("--------");

        //Pega o elemento da cabeça da fila sem remover, se tiver vazia mostra null
        System.out.println("Elemento da cabeça com método peek: " + queueCarros.peek());
        System.out.println("--------");

        //Exibi remove elemento da cabeça ou retorna nulo para caso de fila vazia
        System.out.println("Elemento da cabeça com método poll: " + queueCarros.poll());
        System.out.println("Nova fila" + queueCarros);
        System.out.println("--------");

        //Método remove: remove o elemento da cabeça
        System.out.println("Método remove: " + queueCarros.remove());
        System.out.println("Nova fila: " + queueCarros);
        System.out.println("--------");

        //Mostra se esta vazia
        System.out.println("Fila esta vazia? " + queueCarros.isEmpty());
        System.out.println("--------");

        //Mostra tamanho da fila
        System.out.println("Tamanho da fila? " + queueCarros.size());
        System.out.println("--------");


    }
}
