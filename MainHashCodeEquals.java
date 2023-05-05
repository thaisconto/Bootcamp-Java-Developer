package equalsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList();
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));
        System.out.println("minha lista: " + listaCarros);
        System.out.println("--------");
        System.out.println("Lista contem Ford: " + listaCarros.contains(new Carro("Ford")));
        System.out.println("---------");
        System.out.println("Lista contem Fiat: " + listaCarros.contains(new Carro("Fiat")));
        System.out.println("---------");
        System.out.println((new Carro("Ford")).hashCode());
        System.out.println((new Carro("Ford1")).hashCode());
        System.out.println("---------");
        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Fiat");
        System.out.println("carro 1 igual carro 2: " + carro1.equals(carro2));
    }
}
