package jjj;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class hhhh {
	public static void main(String[] args) {

		Jogador j1 = new Jogador("Ederson", 30, "Manchester City", Posicao.GOLEIRO, 31395403.00);
		Jogador j2 = new Jogador("Yan Couto", 31, "Girona", Posicao.LATERAL, 1695320.00);
		Jogador j3 = new Jogador("Gabriel Magalhães ", 25, "Arsenal", Posicao.ZAGUEIRO, 357900.00);
		Jogador j4 = new Jogador("Marquinhos", 29, "PSG", Posicao.ZAGUEIRO, 7639604600.00);
		Jogador j5 = new Jogador("Carlos Augusto", 24, "Inter de Milão", Posicao.LATERAL, 97000.00);
		Jogador j6 = new Jogador("Casemiro", 31, "Manchester United", Posicao.MEIO_CAMPO, 112000000.00);
		Jogador j7 = new Jogador("Bruno Guimarães", 26, "Newcastle", Posicao.MEIO_CAMPO, 2470000.00);
		Jogador j8 = new Jogador("Neymar", 31, "Al Hilal", Posicao.MEIO_CAMPO, 55000000.00);
		Jogador j9 = new Jogador("Vinicius Junior", 22, "Real Madrid", Posicao.ATACANTE, 50000000.00);
		Jogador j10 = new Jogador("Rodrygo", 22, "Real Madrid", Posicao.ATACANTE, 38000000.00);
		Jogador j11 = new Jogador("Gabriel Jesus", 26, "Arsenal", Posicao.ATACANTE, 30000000.00);

		Selecao selecao = new Selecao("Brasileira" , 5);
		selecao.adicionarJogador(j1);
		selecao.adicionarJogador(j2);
		selecao.adicionarJogador(j3);
		selecao.adicionarJogador(j4);
		selecao.adicionarJogador(j5);
		selecao.adicionarJogador(j6);
		selecao.adicionarJogador(j7);
		selecao.adicionarJogador(j8);
		selecao.adicionarJogador(j9);
		selecao.adicionarJogador(j10);
		selecao.adicionarJogador(j11);

		ArrayList<Jogador> jogadores = selecao.getJogadores();

		System.out.println(selecao.getNome());
		System.out.println("Numero de copa -> " + selecao.getQuatidadeCopa());

		System.out.println("\n---Informações dos jogadores---\n");

		// Formatando a saída para evitar notação científica
		DecimalFormat df = new DecimalFormat("#.##");

		for (Jogador jogador : jogadores) {
			System.out.println("Nome: " + jogador.getNome());
			System.out.println("Idade: " + jogador.getIdade());
			System.out.println("Time: " + jogador.getNomeTime());
			System.out.println("Salário: R$ " + df.format(jogador.getSalario()));
			System.out.println(jogador.getPosicao());
			System.out.println("---------------------------------------");
		}
		double somaSalarios = 0;
		for (Jogador jogador : jogadores) {
			somaSalarios += jogador.getSalario();
		}

		String somaSalariosFormatada = df.format(somaSalarios);

		System.out.println("Soma dos salários dos jogadores -> " + somaSalariosFormatada);

	}
}