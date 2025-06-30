import javax.swing.JOptionPane;

public class SomaDeNumeros {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0;
        boolean erro = false;
        
        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro: "));
            if (n1 < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException ex) {
            erro = true;
            JOptionPane.showMessageDialog(null, "O primeiro número é menor que zero ou não é um número inteiro!");
        }
        
        try {
            n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número inteiro: "));
            if (n2 < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException ex) {
            erro = true;
            JOptionPane.showMessageDialog(null, "O segundo número é menor que zero ou não é um número inteiro!");
        }
        
        if (!erro) {
            JOptionPane.showMessageDialog(null, "A soma dos dois números é: " + (n1 + n2));
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível realizar a soma.");
        }
    }
}