import javax.swing.JOptionPane;

public class ValidacaoUsuarioSenha {
    public static void main(String[] args) {
        // Usuário e senha padrão para validação
        String usuarioPadrao = "usuario";
        String senhaPadrao = "senha123";
        
        // Exibir menu
        String[] opcoes = {"Entrar", "Sair"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
        
        switch (escolha) {
            case 0:
                String usuario = JOptionPane.showInputDialog("Digite o usuário:");
                String senha = JOptionPane.showInputDialog("Digite a senha:");
                
                // Validar usuário e senha
                if (usuario != null && senha != null && usuario.equals(usuarioPadrao) && senha.equals(senhaPadrao)) {
                    JOptionPane.showMessageDialog(null, "Usuário válido!");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
                }
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Saindo...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
}