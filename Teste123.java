package projetoswing.licoesdeula;

import java.util.Scanner;

public class Teste123 {
    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o primeiro numero:");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = entrada.nextInt();

        do {
            menu();
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        entrada.close();
    }

    public static void menu() {
        System.out.println("Calcular a diferenciada");
        System.out.println("1. Soma");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("0. Sair");
        System.out.println("Digite a opção de 0 a 4:");
    }
}