package arvoreBinaria;
//ordem de criação dos métodos: inserir publico e privado, exibição (publico e privado) inOrdem, posOrdem, preOrdem, remove,
public class ArvoreBinaria<T extends Comparable<T>> {
    //criar nó raiz
    private BinNo<T> raiz;

    //toda vez que inicar uma arvore, garantir que a raiz seja nula
    public ArvoreBinaria(){
        this.raiz = null;
    }

    //método inserir publico: baseado no inserir privado
    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    //método inserir privado: será um método recursivo
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        //se nó atual é nulo, então arvore esta vazia e é só retornar novo Nó
        if(atual == null){
            return novoNo;
        //se novo nó é menor que nó atual(menor retorna-1, igual retorna 0 e maior retorna 1)
        //então vai para a esquerda
        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        //se novo nó é maior que nó atual, então vai para direita
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    //método exibir inOrdem: baseado no método exibir privado-recursivo
    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }

    //método exibir inOrdem privado (método recursivo)
    //visita esquerda, exibi, e visita direita
    private void exibirInOrdem(BinNo<T> atual){
        //se nó atual não for nulo, então
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    //método exibir posOrdem
    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    //método exibir posOrdem privado (método recursivo)
    //visita esquerda, direita e exibi
    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    //método exibir preOrdem
    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    //método exibir preOrdem privado (método recursivo)
    //exibi e depois visita esquerda e direita
    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }
//método remover: recebe conteúdo, retorno vazio
    public void remover(T conteudo){
        //try catch, quando não encontrar o conteúdo que quero remover, exception: exibir mensagem (final do código)
        try{
            //criar os nós atual (recebe raiz), pai, filho e temporario
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;


            //percorrer a arvore para encontrar o conteudo que quero remover
            //enquando o atual for diferente de nulo e não for igual ao conteúdo, continua o loop
            while (atual != null && !atual.getConteudo().equals(conteudo)){
                //se pai for igual atual,
                pai = atual;
                //então: compare o conteudo atual com o conteudo que quero remover
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    //se atual menor que conteudo, vou para nó esquerdo
                    atual = atual.getNoEsq();
                }else {
                    //se não, atual vai para nó direito
                    atual = atual.getNoDir();
                }
            }
            //se atual for nulo, exibir mensagem
            if(atual == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            //testar vários casos: se pai = nulo, direito = nulo, esquerdo = nulo

            //pai = nulo, ou seja estamos na raiz
            if(pai == null){
                //se direito = nulo
                if(atual.getNoDir() == null){
                    //entao raiz será nó da esquerda
                    this.raiz = atual.getNoEsq();
                    //se esquerdo = nulo
                }else if(atual.getNoEsq() == null){
                    //então raiz será nó direito
                    this.raiz = atual.getNoDir();
                    //caso não seja nulo
                }else {
                    for(temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null; //condição de parada no for
                        temp = filho, filho = filho.getNoEsq() //a cada ciclo, ando um nó para esquerda
                    ){
                        if(filho != atual.getNoEsq()){ //filho diferente da referencia de nó esquerdo do atual
                            temp.setNoDir(filho.getNoEsq()); //estou removendo e rearranjando os nós
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }

                // se direito = nulo
            }else if(atual.getNoDir() == null){
                //se esquerdo = atual
                if(pai.getNoEsq() == atual){
                    //então pai passa a apontar para esquerdo
                    pai.setNoEsq(atual.getNoEsq());
                }else {
                    pai.setNoDir(atual.getNoEsq());
                }

                //se esquerdo = nulo, igual anteior mas invertido
            }else if(atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else {
                    pai.setNoDir(atual.getNoDir());
                }

                //em último caso:
            }else{
                for( //temporário é atual, etnão filho é esquerdo,
                        temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoDir()
                ){
                    //se filho diferente do esquerdo
                    if(filho != atual.getNoEsq()){
                        //então o temporatório aponta para direito que é o nó esquerda
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }
            }
        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
    }

}
