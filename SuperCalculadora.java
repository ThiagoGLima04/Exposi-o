import javax.swing.JOptionPane;

public class SuperCalculadora{
	public static void main (String [] args){
		double primeiroValor, segundoValor, terceiroValor, quartoValor, resultado;
		primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("insira aqui o primeiro valor"));
		segundoValor = Double.parseDouble(JOptionPane.showInputDialog("insira aqui o segundo valor"));
		terceiroValor = Double.parseDouble(JOptionPane.showInputDialog("insira aqui o terceiro valor"));
		quartoValor = Double.parseDouble(JOptionPane.showInputDialog("insira aqui o quarto valor"));
		resultado = primeiroValor + segundoValor + terceiroValor + quartoValor;
		JOptionPane.showMessageDialog(null, "soma = " + resultado);
	}
}