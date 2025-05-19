package jjj;

public class Jogador {
	private String nome;
	private int idade;
	private String nomeTime;
	private final Posicao posicao;
	private double salario;

	public Jogador(String nome, int idade, String nomeTime, Posicao posicao, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.nomeTime = nomeTime;
		this.posicao = posicao;
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public String getNomeTime() {
		return nomeTime;
	}
}