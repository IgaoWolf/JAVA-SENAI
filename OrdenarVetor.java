package ordenarvetor;

import javax.swing.JOptionPane;

public class OrdenarVetor {

	private static int vetor[] = new int[10];
	private static int aux1 = 0;
	
	public static void main(String[] args) {
		coletarDados();
		ordenarDados();
		exibirDados();	
	}
	
	private static void coletarDados() {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		}
	}

	private static void ordenarDados() {
		boolean verificacao = true;
		while (verificacao) {
			verificacao = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux1 = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux1;
                    verificacao = true;
				}
            }
		}
	}
	private static void exibirDados() {
		String mensagem = "";
		for (int i = 0; i < vetor.length; i++) {
			mensagem = mensagem + vetor[i] + " ";
		}
		JOptionPane.showMessageDialog(null, mensagem);
		
	}
}
