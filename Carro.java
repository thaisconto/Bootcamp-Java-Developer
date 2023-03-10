package equalsHashCode;

import java.util.Objects;
public class Carro {

    //variavel marca
    private String marca;


    public Carro(String marca) {
        this.marca = marca;
    }

    //generate: get and setter, equals and hashcode
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        //se objeto for igual, retorna true
        if (this == o) return true;
        //testa se for diferente, retorna false
        if (!(o instanceof Carro)) return false;
        //cria objeto carro temporario, e compara se um objeto é igual ao outro
        Carro carro = (Carro) o;
        return Objects.equals(getMarca(), carro.getMarca());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarca());
    }
}
