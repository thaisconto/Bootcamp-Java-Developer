package estrutura.dados.pilhas;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));
        System.out.println("Impimir minha pilha" + minhaPilha);
        System.out.println("Método pop, remove " + minhaPilha.pop());
        System.out.println("Minha nova pilha" + minhaPilha);
        System.out.println("Método push: acrescentar número 99 na pilha");
        minhaPilha.push(new No(99));
        System.out.println(minhaPilha);
        System.out.println("Método top, mostra último elemento da pilha: " + minhaPilha.top());
        System.out.println("---------------");
        System.out.println("Método isEmpty, pilha está vazia? " + minhaPilha.isEmpty());
    }
}
