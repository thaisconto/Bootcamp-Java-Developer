package listaDuplamenteEncadeada;
//ordem criação do código (para estudos): declarar variáveis, size, getNo, get, add, remove e toString
public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    //variável tamanho lista para auxiliar no método size
    private int tamanhoLista = 0;

    //método add: adicionando apenas ao final da lista
    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        //se próximo nó é nulo, então primeiro nó será o novo nó
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        //se o próximo nó é diferente de nulo, então o novo nó aponta para último nó
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        //implementa um tamanho na lista
        tamanhoLista++;
    }

    //método add: escolhendo a posição na lista
    public void add(int index, T elemento){
        //nó auxiliar vai receber o nó do índice estou passando novo valor
        NoDuplo<T> noAuxiliar = getNo(index);
        //novo nó que estou inserindo na lista
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        //nó set próximo é o nó auxiliar
        novoNo.setNoProximo(noAuxiliar);

        //se o próximo nó diferente de nulo,
        if(novoNo.getNoProximo() != null){
            //então novo nó aponta para previo, e auxiliar pega valor do previo
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            //e novo nó pega valor do próximo e altera para novo nó
            novoNo.getNoProximo().setNoPrevio(novoNo);

        }else {
            //se próximo nó é nulo, estamos no último elemento da lista
            //então último nó se torna novo nó
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }
        //se índice for zero, então novo nó é o primeiro nó
        if(index == 0){
            primeiroNo = novoNo;
        }else {
        //se índice diferente de zero, então estamos no meio da lista
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    //método remove: considerando uma posição específica
    public void remove(int index){
        //se índice igual a 0, estou na primeira posição da lista
        if(index == 0){
            //então primeiro nó recebe o valor do próximo
            primeiroNo = primeiroNo.getNoProximo();
            //se primeiro nó diferente de nulo
            if(primeiroNo != null){
                //então o primeiro nó apontará para nulo
                primeiroNo.setNoPrevio(null);
            }
         //se índice diferente de zero
        }else{
            NoDuplo<T> noAuxiliar = getNo(index);
            //nó 0,1,2. Estou tirando o nó 1, então a referencia 0-1 muda para 0-2
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            //se não estou no último nó
            if(noAuxiliar != ultimoNo){
                //então desligando a referencia 2-1 e deixando 2-0
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
                //caso seja o último
            }else{
                ultimoNo = noAuxiliar;
            }
        }
        tamanhoLista--;
    }

    //método get: baseado no getNo
    public T get(int index){
        return getNo(index).getConteudo();
    }

    //método getNo: privado por será usado apenas internamente
    private NoDuplo<T> getNo(int index){
        //primeiro valor que o auxilixar recebe é o primeiro nó
        NoDuplo<T> noAuxiliar = primeiroNo;
        //laço passando por cada índice e o nó auxiliar recebe o valor do próximo nó
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    //método size: mostra o tamanho da lista
    public int size(){
        return tamanhoLista;
    }

    //método toString
    @Override
    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += noAuxiliar.getConteudo() +" ---> ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
