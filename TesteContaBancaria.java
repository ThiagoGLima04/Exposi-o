public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("12345", 1000.0, 500.0);
        ContaBancaria conta2 = new ContaBancaria("67890", 2000.0, 1000.0);

        System.out.println("Saldo inicial da conta 1:");
        conta1.consultarSaldo();
        System.out.println();

        System.out.println("Realizando operações na conta 1:");
        conta1.deposito(500.0);
        conta1.saque(200.0);
        conta1.saque(2000.0);
        System.out.println();

        System.out.println("Saldo final da conta 1:");
        conta1.consultarSaldo();
        System.out.println();

        System.out.println("Extrato da conta 1:");
        conta1.imprimirExtrato();
        System.out.println();

        System.out.println("Saldo inicial da conta 2:");
        conta2.consultarSaldo();
        System.out.println();

        System.out.println("Realizando operações na conta 2:");
        conta2.deposito(1000.0);
        conta2.saque(1500.0);
        conta2.saque(5000.0);
        System.out.println();

        System.out.println("Saldo final da conta 2:");
        conta2.consultarSaldo();
        System.out.println();

        System.out.println("Extrato da conta 2:");
        conta2.imprimirExtrato();
    }
}