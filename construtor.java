package primeiro.teste;

import java.util.Objects;

public class construtor {

	private String nome;
	private Sring cor;
	private Integer idade;
	
	public construtor(String nome, Sring cor, Integer idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}
	//CRTL +3 > pesquisar por construtor generate using fields
	
	// CRTL +3 > pesquisar por getters and setters
	
	//CRTL +3 > pesquisar por hash code equals methods
	
	//CRTL +3 > pesquisar por to string
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sring getCor() {
		return cor;
	}

	public void setCor(Sring cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		construtor other = (construtor) obj;
		return Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "construtor [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
}


