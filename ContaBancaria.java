public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private double limite;

    public ContaBancaria(String numeroConta, double saldo, double limite) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    public void saque(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo disponível: " + saldo);
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da conta:");
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }
}