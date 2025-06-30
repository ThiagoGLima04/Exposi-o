import javax.swing.JOptionPane;

public class SomaDoisNumeros {
	public static void main (String[] args) {
		double primeiroValor, segundoValor, resultado;
		primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundoValor:"));
		segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiroValor:"));
		resultado = primeiroValor + segundoValor;
		JOptionPane.showMessageDialog(null, "soma = " + resultado);
}}

	