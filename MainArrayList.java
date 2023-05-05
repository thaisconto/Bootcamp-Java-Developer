package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<Carro> listCarros = new ArrayList();
        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));
        System.out.println("Minha lista: " + listCarros);
        System.out.println("------");
        System.out.println("Lista contém carro Ford? " + listCarros.contains(new Carro("Ford")));
        System.out.println("------");
        System.out.println("Qual o carro do índice 1? " + listCarros.get(1));
        System.out.println("------");
        System.out.println("Qual índice está o carro Fiat? " + listCarros.indexOf(new Carro("Fiat")));
        System.out.println("------");
        System.out.println("Remova carro do índice 2: " + listCarros.remove(2));
        System.out.println("Nova lista: " + listCarros);
        System.out.println("------");
    }
}
