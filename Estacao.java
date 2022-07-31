package estacaoes;

import javax.swing.JOptionPane;

public class Estacao {
	private static byte mesbyte, diabyte;
	private static String dia, mes, estacao;

	public static void main(String[] args) {
		iserirDiaeMes();
		validarDiaeMes();
		encontrarEstacaoDoAno();
		exibirEstacao();
	}
	private static void iserirDiaeMes() {
		dia = "Informe um dia valido (1 á 31): ";
		dia = JOptionPane.showInputDialog(null, dia);
		mes = "Informe um mês (1 á 12): ";
		mes = JOptionPane.showInputDialog(null, mes);
		mesbyte = Byte.parseByte(mes);
		diabyte = Byte.parseByte(dia);
	}
	private static void validarDiaeMes() {
		switch (mesbyte) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (diabyte > 31 || diabyte < 1) {
				dia = "Dia invalido";
				JOptionPane.showMessageDialog(null, dia);
				System.exit(0);
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (diabyte > 30 || diabyte < 1) {
				dia = "Dia invalido";
				JOptionPane.showMessageDialog(null, dia);
				System.exit(0);
			}
			break;
		case 2:
			if (diabyte > 29 || diabyte < 1) {
				dia = "Dia invalido";
				JOptionPane.showMessageDialog(null, dia);
				System.exit(0);
			}
			break;
		default:
			break;
		}
	}
	private static void encontrarEstacaoDoAno() {
		if (diabyte > 21 && mesbyte == 12 || diabyte < 22 && mesbyte == 3 || mesbyte < 3) {
			estacao = "Verão";
		} else if (diabyte > 21 && mesbyte == 3 || diabyte < 22 && mesbyte == 6 || mesbyte < 6) {
			estacao = "Outono";
		} else if (diabyte > 21 && mesbyte == 6 || diabyte < 22 && mesbyte == 9 || mesbyte < 9) {
			estacao = "Inferno";
		} else if (diabyte > 21 && mesbyte == 9 || diabyte < 22 && mesbyte == 12 || mesbyte < 12) {
			estacao = "Primavera";
		}
	}
	private static void exibirEstacao() {
		JOptionPane.showMessageDialog(null, estacao);
		System.exit(0);
	}
}