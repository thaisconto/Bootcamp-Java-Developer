package estrutura.dados.pilhas;

public class Pilha {
    No refNoEntradaPilha = null;

    //criar método push: acrescenta um "livro" na pilha
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    //criar método pop: retira/exclui um elemento da pilha
    public No pop(){
        //antes de retirar um elemento precisa verificar se a pilha esta vazia
        //se diferente de vazia - !isEmpty
        if(!isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    //criar método top: apenas verifica alguma informação da pilha
    public No top(){
        return refNoEntradaPilha;
    }

    //criar método isEmpty - mostra se a pilha está vazia (true) ou não (false)
    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        //nó auxiliar vai percorrer a pilha e mostrar as informações
        No noAuxiliar = refNoEntradaPilha;
        //criar um loop para o nó auxiliar percorrer
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
