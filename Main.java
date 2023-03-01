package listaEncadeada;

public class Main {
    public static void main(String args[]){

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");

        System.out.println("Método get para cada posição:");
        System.out.println("índice 0: " + minhaListaEncadeada.get(0));
        System.out.println("índice 1: " + minhaListaEncadeada.get(1));
        System.out.println("índice 2: " +minhaListaEncadeada.get(2));
        System.out.println("índice 3: " +minhaListaEncadeada.get(3));

        System.out.println("-------");


        System.out.println("Minha lista: " + minhaListaEncadeada);


        System.out.println("-------");

        minhaListaEncadeada.remove(3);

        System.out.println("Método remover índice 3: ");
        System.out.println("Nova lista: " + minhaListaEncadeada);

        System.out.println("-------");

        System.out.println("Método size, tamanho da lista: " + minhaListaEncadeada.size());


        System.out.println("-------");

        System.out.println("Método get, adicionar teste 10: ");
        minhaListaEncadeada.add("teste10");
        System.out.println("Nova lista: " + minhaListaEncadeada);


        System.out.println("-------");

    }
}
