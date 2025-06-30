import javax.swing.JOptionPane;

public class Lucro {
    private int numeroClientes;

    // Metodo para calcular a media de gastos por cliente
    public void calcularMediaGastoPorCliente() {
        // Inicializa a variavel para armazenar o total de gastos de todos os clientes
        double totalGastos = 0;

        // Solicita ao usuario que informe quantos clientes serao considerados
        int numeroClientes = Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira o numero de clientes: "));

        // Loop para cada cliente calcular seus gastos
        for (int i = 0; i < numeroClientes; i++) {
            // Solicita ao usuario os gastos com bebidas e comidas para cada cliente
            double gastoBebidas = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o valor gasto com bebidas pelo cliente " + (i + 1) + ": "));
            double gastoComidas = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o valor gasto com comidas pelo cliente " + (i + 1) + ": "));
            
            // Calcula o total de gastos do cliente atual e adiciona ao total geral
            totalGastos += gastoBebidas + gastoComidas;
        }

        // Calcula a media de gastos por cliente
        double mediaGastoPorCliente = totalGastos / numeroClientes;
        
        // Exibe a media de gastos por cliente
        JOptionPane.showMessageDialog(null, "A media de gastos por cliente e: " + mediaGastoPorCliente);
    }

    // Metodo para calcular a media geral de gastos de todos os clientes
    public void calcularMediaGeral() {
        // Inicializa a variavel para armazenar o total de gastos de todos os clientes
        double totalGastos = 0;

        // Solicita ao usuario que informe quantos clientes serao considerados
        int numeroClientes = Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira o numero de clientes: "));

        // Loop para cada cliente calcular seus gastos
        for (int i = 0; i < numeroClientes; i++) {
            // Solicita ao usuario os gastos com bebidas e comidas para cada cliente
            double gastoBebidas = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o valor gasto com bebidas pelo cliente " + (i + 1) + ": "));
            double gastoComidas = Double.parseDouble(JOptionPane.showInputDialog("Por favor, insira o valor gasto com comidas pelo cliente " + (i + 1) + ": "));
            
            // Calcula o total de gastos do cliente atual e adiciona ao total geral
            totalGastos += gastoBebidas + gastoComidas;
        }

        // Calcula a media geral de gastos de todos os clientes
        double mediaGeral = totalGastos / numeroClientes;
        
        // Exibe a media geral de gastos
        JOptionPane.showMessageDialog(null, "A media geral de gastos e: " + mediaGeral);
    }

    // Metodo principal para testar os calculos
    public static void main(String[] args) {
        Lucro lucro = new Lucro();
        lucro.calcularMediaGastoPorCliente();
        lucro.calcularMediaGeral();
    }
}