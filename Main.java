package listaDuplamenteEncadeada;

public class Main {
    public static void main(String args[]){

        ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

        //adicionando valores a lista
        minhaListaEncadeada.add("c1");
        minhaListaEncadeada.add("c2");
        minhaListaEncadeada.add("c3");
        minhaListaEncadeada.add("c4");
        minhaListaEncadeada.add("c5");
        minhaListaEncadeada.add("c6");
        minhaListaEncadeada.add("c7");

        System.out.println("Minha lista: " + minhaListaEncadeada);

        System.out.println("-----------");

        System.out.println("Remover c4, índice 3");
        minhaListaEncadeada.remove(3);
        System.out.println(minhaListaEncadeada);

        System.out.println("-----------");

        System.out.println("Adicionar 99 a posição 4 (índice 3)");
        minhaListaEncadeada.add(3, "99");
        System.out.println(minhaListaEncadeada);

        System.out.println("-----------");

        System.out.println("Tamanho da lista: " + minhaListaEncadeada.size());

    }
}
