import javax.swing.JOptionPane;

public class ConversaoDeDolar{
	public static void main (String [] args ){
	double valorDoDolar, quantidadeDeDolar, resultado;
	valorDoDolar = Double.parseDouble (JOptionPane.showInputDialog("Digite o valor do dolar aqui"));
	quantidadeDeDolar = Double.parseDouble (JOptionPane.showInputDialog("Digite a quantidade de dolar aqui"));
	resultado = valorDoDolar * quantidadeDeDolar;
	JOptionPane.showMessageDialog(null, "real = " + resultado);
}
}