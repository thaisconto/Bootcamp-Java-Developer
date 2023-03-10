package stack;
import java.util.Stack;

public class Main {

    public static void main(String args[]){

        //criar lista pelo stack
        Stack<Carro> stackCarros = new Stack<>();

        //método push para adicinar itens a pilha
        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println("Minha pilha: " + stackCarros);
        System.out.println("-------");

        System.out.println("Método pop, retira o último adicionado a pilha: " + stackCarros.pop());
        System.out.println("Nova pilha: " + stackCarros);
        System.out.println("-------");

        System.out.println("Método peek, exibi o último item da pilha: " + stackCarros.peek());
        System.out.println("-------");

        System.out.println("Método empty, pilha está vazia? " + stackCarros.empty());
        System.out.println("-------");
    }
}
