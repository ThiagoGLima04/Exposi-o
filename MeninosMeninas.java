import java.util.Scanner;

public class MeninosMeninas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Estatísticas de altura e sexo
        System.out.println("=== Estatísticas de altura e sexo ===");
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        int numMulheres = 0;
        double somaAlturaHomens = 0;
        int numHomens = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a altura da pessoa " + i + ": ");
            double altura = scanner.nextDouble();
            scanner.nextLine();  // Limpar o buffer do scanner

            System.out.print("Digite o sexo da pessoa " + i + " (M/F): ");
            char sexo = scanner.nextLine().charAt(0);

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (sexo == 'F' || sexo == 'f') {
                numMulheres++;
            } else if (sexo == 'M' || sexo == 'm') {
                somaAlturaHomens += altura;
                numHomens++;
            } else {
                System.out.println("Sexo inválido. Por favor, digite M ou F.");
                i--;  // Decrementar o índice para repetir a entrada
            }
        }

        double mediaAlturaHomens = somaAlturaHomens / numHomens;

        System.out.println("\nMaior altura: " + maiorAltura);
        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura dos homens: " + mediaAlturaHomens);
        System.out.println("Número de mulheres: " + numMulheres);

        // Classificação de produtos
        System.out.println("\n=== Classificação de produtos ===");
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        String classificacao;

        switch (codigo) {
            case 1:
                classificacao = "Alimento não perecível";
                break;
            case 2:
            case 3:
            case 4:
                classificacao = "Alimento perecível";
                break;
            case 5:
            case 6:
                classificacao = "Vestuário";
                break;
            case 7:
                classificacao = "Higiene pessoal";
                break;
            case 8:
            case 9:
            case 10:
                classificacao = "Limpeza e utensílios domésticos";
                break;
            default:
                classificacao = "Código inválido";
                break;
        }

        System.out.println("Classificação do produto: " + classificacao);

        // Calculadora
        System.out.println("\n=== Calculadora ===");
        int opcao;
        double num1, num2;

        do {
            System.out.println("\nSelecione a operação desejada:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("9. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: divisão por zero.");
                    }
                    break;
                case 9:
                    System.out.println("Encerrando a calculadora...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 9);

        scanner.close();
    }
}