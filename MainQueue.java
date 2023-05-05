package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList();
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));
        System.out.println("Minha fila: " + queueCarros);
        System.out.println("--------");
        System.out.println("Método add, adicionar Peugeot: " + queueCarros.add(new Carro("Peugeot")));
        System.out.println("Nova Fila: " + queueCarros);
        System.out.println("--------");
        System.out.println("Elemento da cabeça da fila com método element: " + queueCarros.element());
        System.out.println("--------");
        System.out.println("Adiconar Renault com método offer: " + queueCarros.offer(new Carro("Renault")));
        System.out.println("Nova fila: " + queueCarros);
        System.out.println("--------");
        System.out.println("Elemento da cabeça com método peek: " + queueCarros.peek());
        System.out.println("--------");
        System.out.println("Elemento da cabeça com método poll: " + queueCarros.poll());
        System.out.println("Nova fila" + queueCarros);
        System.out.println("--------");
        System.out.println("Método remove: " + queueCarros.remove());
        System.out.println("Nova fila: " + queueCarros);
        System.out.println("--------");
        System.out.println("Fila esta vazia? " + queueCarros.isEmpty());
        System.out.println("--------");
        System.out.println("Tamanho da fila? " + queueCarros.size());
        System.out.println("--------");
    }
}
