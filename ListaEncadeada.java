package listaEncadeada;

public class ListaEncadeada<T> {
    private No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }


    //método add: adiciona um nó na lista na posição desejada
    public void add(T conteudo){
        No<T> novoNo = new No(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size() - 1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    //método add, baseado no método getNo
    public T get(int index){
        return getNo(index).getConteudo();
    }

    //método getNo: será utilizado apenas internamente
    //
    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    //método remove, baseado no método getNo
    public T remove(int index){
        validaIndice(index);
        No<T> noPivor = getNo(index);
        if(index == 0){
            //essa parte do loop só serve para índice = 0
            //se o índice for zero, então a referença de entrada será o indice 1
            referenciaEntrada = noPivor.getProximoNo();
            //retornar o conteúdo do nó que acabou de ser removido
            return noPivor.getConteudo();
        }
        //para índice diferente de 0

        No<T> noAnterior = getNo(index - 1);
        //peguei o nó anterior e disse que o próximo nó é o nó depois do da frente dele
        //ou seja, ex: estou tirando o nó 3 e falando para o nó 2 se ligar com o nó 4
        noAnterior.setProximoNo(noPivor.getProximoNo());
        //retornar o conteúdo do nó que acabou de ser removido
        return noPivor.getConteudo();
    }

    //método size, retorna o tamanho da lista
    public int size(){
        //variável que vai contabilizar o tamanho da lista
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while(true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else{
                    //se nó referencia for nulo, dá um break no loop
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    //método para validar se o número do índice é valido
    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + '.');
        }
    }

    //MÉTODO isEmpty
    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    //get e set do nó referencia de entrada
    public No<T> getReferenciaEntrada() {
        return referenciaEntrada;
    }

    public void setReferenciaEntrada(No<T> referenciaEntrada) {
        this.referenciaEntrada = referenciaEntrada;
    }

    //método toString
    @Override
    public String toString() {
        String strRetorno = "";
        //nó auxiliar que irá percorrer a lista
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size(); i++){
            strRetorno += noAuxiliar.getConteudo() + " ---> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
