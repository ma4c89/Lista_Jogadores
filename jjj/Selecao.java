package jjj;

import java.util.ArrayList;

public class Selecao {
	private String nome;
	private int quatidadeCopa;
	private ArrayList<Jogador> jogadores;

	public Selecao(String nome, int quatidadeCopa) {
		this.nome = nome;
		this.quatidadeCopa = quatidadeCopa;
		this.jogadores = new ArrayList<>();
	}

	public int getQuatidadeCopa() {
		return quatidadeCopa;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionarJogador(Jogador jogador) {
		this.jogadores.add(jogador);
	}

	public double somaSalarios() {
		double soma = 0;
		for (Jogador jogador : jogadores) {
			soma += jogador.getSalario();
		}
		return soma;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

}
