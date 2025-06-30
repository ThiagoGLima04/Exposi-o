class Pessoa 
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
    }
}

public class Estudos {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Osmar J. Carvalho", 31, "OJC33-65");
        Aluno aluno2 = new Aluno("Almeida F. Silva", 22, "ASO44-35");
        Aluno aluno3 = new Aluno("Silveira C. Oliveira", 46, "SCA55-45");

        System.out.println("Dados do aluno 1:");
        aluno1.exibirDados();
        System.out.println();

        System.out.println("Dados do aluno 2:");
        aluno2.exibirDados();
        System.out.println();

        System.out.println("Dados do aluno 3:");
        aluno3.exibirDados();
    }
}