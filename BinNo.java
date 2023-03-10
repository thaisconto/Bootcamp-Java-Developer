package arvoreBinaria;

public class BinNo<T extends Comparable<T>> {
    //a classe de nó binário extends o método de comparação
    private T conteudo;
    //criar variáveis de nó direito e esquerdo
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    //construtor só do contepudo, e nós iniciam com nulo
    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        noEsq = noDir = null;
    }

    //construtor simples e vazio
    public BinNo() {
    }

    //getter and setter e toString
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
