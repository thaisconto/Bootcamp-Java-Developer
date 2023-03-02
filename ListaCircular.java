package listaCircular;
//ordem de criação dos métodos: isempty, size, getNo, get, remove, add, toString
public class ListaCircular<T> {
    //cabeça = último elemento da lista
    private No<T> cabeca;
    //cauda = primeiro elemento da lista
    private No<T> cauda;
    //tamanho lista será usado para método size
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    //método add: entra conteúdo e não tem retorno
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        //se lista vazia, então o novo nó é tanto a cabeça quanto a cauda
        if(tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            //precisa fazer a referência/ligação entre eles
            this.cabeca.setNoProximo(this.cauda);
         //se lista já tem algum elemento
        }else{
            //adiciona o novo nó atrás da cauda
            novoNo.setNoProximo(this.cauda);
            //a cabeça aponta para o novo nó
            this.cabeca.setNoProximo(novoNo);
            //o novo nó se torna a cauda
            this.cauda = novoNo;
        }
        //incremento o tamanho da lista
        this.tamanhoLista++;
    }

    //método remove: recebe indice, não tem retorno(vazio=void), baseado no método getNo
    public void remove(int index){
        //se índice é maior ou igual ao tamanho da lista, se sim: exception
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

        //se índice menor que tamanho lista: nó auxiliar entra pela cauda
        No<T> noAuxiliar = cauda;
        //se índice igual zero, então quero remover a cauda, dessa forma a cauda passa a ser o próximo nó
        if(index == 0){
            //cauda vira próximo nó
            this.cauda = this.cauda.getNoProximo();
            //cabeça precisa mudar a referência(set) para a nova cauda
            this.cabeca.setNoProximo(cauda);
        //se está no índice 1
        }else if(index == 1){
            //então a cauda passa a apontar (set) para o próximo (índice 2) e remove o nó índice 1
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else{
            //se não for índice 0 ou 1, então vou percorrer a lista até encontrar o índice desejado
            //se quero excluir índice 2, então meu auxiliar deve estar no índice 1
            for(int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            //auxiliar (índice 1) aponta para o próximo.próximo (índice 3) e remove o nó índice 2
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        //como removi, preciso alterar o tamanho da lista
        this.tamanhoLista--;
    }

    //método get: recebe indice e retorna valor do nó, baseado no método getNo
    public T get(int index){
        return getNo(index).getConteudo();
    }

    //método getNo: irá receber apenas o índice e retornar valor nó auxiliar
    private No<T> getNo(int index){
        //se a lista estiver vazia, um exception
        if(isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        //caso não esteja vazia, mas seja índice zero: retornar a cauda
        if(index == 0){
            return this.cauda;
        }

        //caso não esteja vazia e índice diferente de zero: nó auxiliar vai "entrar" pela cauda
        No<T> noAuxiliar = this.cauda;
        //nó auxiliar irá percorrer toda a lista
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    //método isEmpty
    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    //método size
    public int size(){
        return this.tamanhoLista;
    }

    //método toString
    @Override
    public String toString() {
        String strRetorno = "";
        //nó auxilidar vai entrar pela cauda
        No<T> noAuxiliar = this.cauda;
        //irá percorrer a lista
        for(int i = 0; i < size(); i++){
            strRetorno += noAuxiliar.getConteudo() +" ---> ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        //se a lista estiver vazia, o auxiliar não entra no for e o último elemento sempre aponta para o primero (retorna ao início)
        //size != 0, imprimir retorna ao início
        //se size = 0, imprimi []
        strRetorno += size() != 0 ? "(Retorna ao início)" : "[]";
        return strRetorno;
    }

}
