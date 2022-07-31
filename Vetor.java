package vetor;

import javax.swing.JOptionPane;

public class Vetor {

	private static int vetor[] = new int[4];
	private static int soma = 0;
	private static int subtracao = 0;
	private static int multiplicao = 1;
	private static int divisao = 0;
	private static int ma = 0;
	private static int mp = 0;
	private static int potencia = 0;
	private static String str;

	public static void main(String[] args) {
		coletarDados();
		calcularDados();
		exibirDados();
	}

	private static void coletarDados() {
		boolean verificacao = true;
		while (verificacao) {
			try {
				for (int i = 0; i < vetor.length; i++) {
					str = "Insire números inteiros : ";
					str = JOptionPane.showInputDialog(null, str);
					vetor[i] = Integer.parseInt(str);
				}
				verificacao = false;
			} catch (NumberFormatException nfe) {
				if (str == null) {
					System.exit(0);

				}
			}
		}
	}

	private static void calcularDados() {

		for (int i = 0; i < vetor.length; i++) {
				soma += vetor[i];
		}
		subtracao = vetor[0];
		for (int i = 1; i < vetor.length; i++) {
				subtracao -= vetor[i];
		}
		for (int i = 0; i < vetor.length; i++) {
			multiplicao *= vetor[i];
		}
		try {
			divisao = vetor[0];
			for (int i = 1; i < vetor.length; i++) 
					divisao /= vetor[i];
			} catch(ArithmeticException ae) {
				JOptionPane.showMessageDialog(null, "Imposivel efetuar uma divisão por zero", "Erro", 0);
				System.exit(0);
			}
		
			ma = soma/vetor.length;
			for (int i = 0; i < vetor.length; i++) {
				mp += vetor[i] * (i+1);
			}
			mp /= 10;		
			potencia = vetor[0];
			for (int i = 0; i < vetor.length; i++) {
				potencia =  (int) Math.pow (potencia, vetor[i]);
			}
	}

	private static void exibirDados() {
		JOptionPane.showMessageDialog(null,
				"Resultado da Soma = " + soma + "\n" + "Resultado da Subtração = " + subtracao
						+ "\nResultado da Multiplicacão = " + multiplicao + "\nResultado da Divisão = " + divisao
						+ "\nResultado da Média Aritmetica = " + ma + "\nResultado da Média Ponderada = " + mp
						+ "\nResultado da Potencia = " + potencia);

	}

}
