package set;

import java.util.Objects;
public class Carro implements Comparable<Carro>{
    private String marca;

    public Carro(String marca){
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro)) return false;
        Carro carro = (Carro) o;
        return Objects.equals(getMarca(), carro.getMarca());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarca());
    }

    @Override
    public String toString() {
        return marca;
    }


    //para o tree set é preciso implementar o método compare to: por ordem alfabetica
    @Override
    public int compareTo(Carro o) {
        return this.getMarca().compareTo(o.getMarca());
    }

/*
para o tree set é preciso implementar o método compare to: por ordem de tamanho

    @Override
  public int compareTo(Carro o) {
       if(this.marca.length() < o.getMarca().length()){
            return -1;
        }else if(this.marca.length() > o.getMarca().length()){
            return 1;
        }
        return 0;
    }
 */

}
