import javax.swing.JOptionPane;

public class IdadeEmDias {
	public static void main (String[] args) {
		double idadeEmAnos, tempo=365, resultado;
		idadeEmAnos = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto anos tens:"));
		resultado = idadeEmAnos * tempo;
		JOptionPane.showMessageDialog(null, "idadeEmDias =" + resultado);
}}