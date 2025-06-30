import java.util.Scanner;

public class AprovacaoAlunos {

    // Metodo para calcular a quantidade de alunos aprovados
    public static int calcularAprovados(float[] medias, int[] faltas) {
        int aprovados = 0;
        for (int i = 0; i < medias.length; i++) {
            // Verifica se a media e maior ou igual a 70 OU se a media e maior ou igual a 40 e as faltas sao menores ou iguais a 15
            if (medias[i] >= 70 || (medias[i] >= 40 && faltas[i] <= 15)) {
                aprovados++;
            }
        }
        return aprovados;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays para armazenar as medias e faltas dos alunos
        float[] medias = new float[20];
        int[] faltas = new int[20];

        // Solicita as informacoes das medias e faltas dos alunos
        System.out.println("Ola, tudo bem? Estou desenvolvendo um programa para calcular a aprovacao dos alunos em uma disciplina.");
        System.out.println("Preciso coletar algumas informacoes suas para prosseguir.");

        for (int i = 0; i < 20; i++) {
            System.out.print("Por favor, informe sua media na disciplina (Aluno " + (i + 1) + "): ");
            medias[i] = scanner.nextFloat();
            System.out.print("Quantas faltas voce teve na disciplina? (Aluno " + (i + 1) + "): ");
            faltas[i] = scanner.nextInt();
        }

        // Calcula a quantidade de alunos aprovados
        int alunosAprovados = calcularAprovados(medias, faltas);

        // Exibe o resultado
        System.out.println("Apos analise dos dados, verificamos que " + alunosAprovados + " alunos foram aprovados na disciplina.");
    }
}