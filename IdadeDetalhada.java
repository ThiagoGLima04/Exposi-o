import javax.swing.JOptionPane;

public class IdadeDetalhada {
	public static void main (String[] args) {
		double idadeEmAnos, ano=365, mes=30, dias, meses, resultado1, resultado2, resultado;
		idadeEmAnos = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos anos tens:"));
		dias = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos dias a mais tens:"));
		meses = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos meses a mais tens:"));
		resultado1 = idadeEmAnos * ano;
		resultado2 = meses * mes;
		resultado = resultado1 + resultado2 + dias;
		JOptionPane.showMessageDialog(null, "idadeEmDias =" + resultado);
}}