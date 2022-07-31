package com.senai.megasena;

import java.util.Random;

public class SorteioMegasena {
	
	private static int cartela[][] = new int[6][10];
	private static int numerosSorteados[] = new int[6];
	private static int contador = 1;
	public static void main(String[] args) {
		exibirNumeros();
		sortearNumeros();
		marcarNumerosSorteados();
	}

	private static void marcarNumerosSorteados() {
		System.out.println("\n\n\n");
		boolean numeroImpresso = false;
		for (int linha = 0; linha < cartela.length; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < cartela[linha].length; coluna++) {
				for (int posicao = 0; posicao < numerosSorteados.length; posicao++) {
					if (cartela[linha][coluna] == numerosSorteados[posicao]) {
						System.out.print("  \t");
						numeroImpresso = true;
					}
				}
				if (!numeroImpresso) {
					extracted(linha, coluna);
				}
				numeroImpresso = false;
				
			}
		}
		
	}

	private static void sortearNumeros() {
		Random numeroSorteado = new Random();

		for (int posicao = 0; posicao < numerosSorteados.length; posicao++) {
			int numero = numeroSorteado.nextInt(59) + 1;
			while (validarNumeroRepetido(numero)) {
				 numero = numeroSorteado.nextInt(59) + 1;
			}
			numerosSorteados[posicao] = numero;
		}
		
	}
	
	private static boolean validarNumeroRepetido(int numero) {
		for (int posicao = 0; posicao < numerosSorteados.length; posicao++) {
			if (numerosSorteados[posicao] == numero) {
				return true;
			}
		}
		
		return false;
	}

	private static void exibirNumeros() {
		for (int linha = 0; linha < cartela.length; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < cartela[linha].length; coluna++) {
				cartela[linha][coluna] = contador;
				extracted(linha, coluna);
				contador++;
			}
		}
	}

	private static void extracted(int linha, int coluna) {
		System.out.printf("%02d\t", cartela[linha][coluna]);
	}

}
