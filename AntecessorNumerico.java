import javax.swing.JOptionPane;

public class AntecessorNumerico {
	public static void main (String[] args) {
		double primeiroValor, segundoValor, resultado;
		primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiroValor:"));
		segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundoValor:"));
		resultado = primeiroValor + segundoValor;
		JOptionPane.showMessageDialog(null, "Valor inteiro =" + resultado);
		JOptionPane.showMessageDialog(null, "Antecessor1 =" + primeiroValor);
		JOptionPane.showMessageDialog(null, "Antecessor2 =" + segundoValor);
}}