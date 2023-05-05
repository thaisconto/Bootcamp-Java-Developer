package listaCircular;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular();
        System.out.println("Adicionando um item a lista: ");
        minhaListaCircular.add("c0");
        System.out.println(minhaListaCircular);
        System.out.println("--------------");
        System.out.println("Removendo o item da lista");
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);
        System.out.println("--------------");
        System.out.println("Nova lista: ");
        minhaListaCircular.add("c1");
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        System.out.println(minhaListaCircular);
        System.out.println("--------------");
        System.out.println("Qual o conteúdo do índice 3?");
        System.out.println((String)minhaListaCircular.get(3));
        System.out.println("--------------");
        System.out.println("A lista está vazia? " + minhaListaCircular.isEmpty());
        System.out.println("--------------");
        System.out.println("Qual o tamanho da lista? " + minhaListaCircular.size());
        System.out.println("--------------");
    }
}
