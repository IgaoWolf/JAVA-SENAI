
package matrizes;

public class Matriz {
	private static int matrizA[][] = new int[3][4];
	private static int matrizB[][] = new int[3][5];
	private static int matrizC[][] = new int[4][4];
	private static int matrizD[][] = new int[4][5];
	private static int contador = 1;

	public static void main(String[] args) {
		atribuirValorMatrizA();
		atribuirValorMatrizB();
		atribuirValorMatrizC();
		exibirMatrizes(matrizA);
		exibirMatrizes(matrizB);
		exibirMatrizes(matrizC);

		calcularMatrizesSoma();
		exibirMatrizes(matrizD);
		calcularMatrizesSubtracao();
		exibirMatrizes(matrizD);
		calcularMatrizesMultiplicacao();
		exibirMatrizes(matrizD);
		calcularMatrizesDivisao();
		exibirMatrizes(matrizD);
		

	}

	private static void calcularMatrizesSoma() {
		for (int linha = 0; linha < matrizD.length; linha++) {
			for (int coluna = 0; coluna < matrizD[linha].length; coluna++) {
				if ((linha == 3) && (coluna == 4)) {
					if ((linha == 3) && (coluna < 4)) {
						matrizD[linha][coluna] = matrizC[linha][coluna];
					}
					if ((coluna == 4) && (linha < 3)) {
						matrizD[linha][coluna] = matrizB[linha][coluna];
					}

				}
				if ((linha < 3) && (coluna < 4)) {
					matrizD[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna] + matrizC[linha][coluna];
				}
			}
		}
	}

	private static void calcularMatrizesSubtracao() {
		for (int linha = 0; linha < matrizD.length; linha++) {
			for (int coluna = 0; coluna < matrizD[linha].length; coluna++) {
				if ((linha == 3) && (coluna == 4)) {
					if ((linha == 3) && (coluna < 4)) {
						matrizD[linha][coluna] = matrizC[linha][coluna];
					}
					if ((coluna == 4) && (linha < 3)) {
						matrizD[linha][coluna] = matrizB[linha][coluna];
					}

				}
				if ((linha < 3) && (coluna < 4)) {
					matrizD[linha][coluna] = matrizA[linha][coluna] - matrizB[linha][coluna] - matrizC[linha][coluna];
				}
			}
		}
	}

	private static void calcularMatrizesMultiplicacao() {
		for (int linha = 0; linha < matrizD.length; linha++) {
			for (int coluna = 0; coluna < matrizD[linha].length; coluna++) {
				if ((linha == 3) && (coluna == 4)) {
					if ((linha == 3) && (coluna < 4)) {
						matrizD[linha][coluna] = matrizC[linha][coluna];
					}
					if ((coluna == 4) && (linha < 3)) {
						matrizD[linha][coluna] = matrizB[linha][coluna];
					}

				}
				if ((linha < 3) && (coluna < 4)) {
					matrizD[linha][coluna] = matrizA[linha][coluna] * matrizB[linha][coluna] * matrizC[linha][coluna];
				}
			}
		}
	}

	private static void calcularMatrizesDivisao() {
		for (int linha = 0; linha < matrizD.length; linha++) {
			for (int coluna = 0; coluna < matrizD[linha].length; coluna++) {
				if ((linha == 3) && (coluna == 4)) {
					if ((linha == 3) && (coluna < 4)) {
						matrizD[linha][coluna] = matrizC[linha][coluna];
					}
					if ((coluna == 4) && (linha < 3)) {
						matrizD[linha][coluna] = matrizB[linha][coluna];
					}

				}
				if ((linha < 3) && (coluna < 4)) {
					matrizD[linha][coluna] = matrizA[linha][coluna] / matrizB[linha][coluna] / matrizC[linha][coluna];
				}
			}
		}
	}

	private static void atribuirValorMatrizA() {
		for (int linha = 0; linha < matrizA.length; linha++) {
			for (int coluna = 0; coluna < matrizA[linha].length; coluna++) {
				matrizA[linha][coluna] = contador;
				contador++;
			}
		}
	}

	private static void atribuirValorMatrizB() {
		for (int linha = 0; linha < matrizB.length; linha++) {
			for (int coluna = 0; coluna < matrizB[linha].length; coluna++) {
				matrizB[linha][coluna] = contador;
				contador++;
			}
		}
	}

	private static void atribuirValorMatrizC() {
		for (int linha = 0; linha < matrizC.length; linha++) {
			for (int coluna = 0; coluna < matrizC[linha].length; coluna++) {
				matrizC[linha][coluna] = contador;
				contador++;
			}
		}
	}

	private static void exibirMatrizes(int[][] matriz) {
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.print("\t" + matriz[linha][coluna]);
			}
			System.out.println();
		}
	}
		
	}
