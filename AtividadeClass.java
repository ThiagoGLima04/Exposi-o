// Classe Aluno
class Aluno {
    // Atributos
    String nome;
    int idade;
    String matricula;
    
    // Construtor
    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
    
    // Métodos
    public void estudar() {
        System.out.println(nome + " está estudando.");
    }
    
    public void fazerProva() {
        System.out.println(nome + " está fazendo uma prova.");
    }
    
    public void solicitarCertificado() {
        System.out.println(nome + " está solicitando um certificado.");
    }
}

// Classe Curso
class Curso {
    // Atributos
    String nome;
    int cargaHoraria;
    Professor professor;
    
    // Construtor
    public Curso(String nome, int cargaHoraria, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }
    
    // Métodos
    public void iniciarCurso() {
        System.out.println("O curso " + nome + " iniciou.");
    }
    
    public void encerrarCurso() {
        System.out.println("O curso " + nome + " encerrou.");
    }
    
    public void adicionarAluno(Aluno aluno) {
        System.out.println("Aluno " + aluno.nome + " adicionado ao curso " + nome + ".");
    }
}

// Classe Professor
class Professor {
    // Atributos
    String nome;
    String especialidade;
    double salario;
    
    // Construtor
    public Professor(String nome, String especialidade, double salario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.salario = salario;
    }
    
    // Métodos
    public void darAula() {
        System.out.println("Professor " + nome + " está dando aula.");
    }
    
    public void corrigirProva() {
        System.out.println("Professor " + nome + " está corrigindo prova.");
    }
    
    public void calcularSalario() {
        System.out.println("O salário do professor " + nome + " é " + salario + ".");
    }
}

// Classe Músico
class Musico {
    // Atributos
    String nome;
    String instrumento;
    String genero;
    
    // Construtor
    public Musico(String nome, String instrumento, String genero) {
        this.nome = nome;
        this.instrumento = instrumento;
        this.genero = genero;
    }
    
    // Métodos
    public void praticar() {
        System.out.println(nome + " está praticando.");
    }
    
    public void tocar() {
        System.out.println(nome + " está tocando " + instrumento + ".");
    }
    
    public void compor() {
        System.out.println(nome + " está compondo uma música.");
    }
}

// Classe Funcionario
class Funcionario {
    // Atributos
    String nome;
    String cargo;
    double salario;
    
    // Construtor
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    // Métodos
    public void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }
    
    public void receberSalario() {
        System.out.println(nome + " recebeu o salário de " + salario + ".");
    }
    
    public void tirarFerias() {
        System.out.println(nome + " está tirando férias.");
    }
}

// Classe Cliente
class Cliente {
    // Atributos
    String nome;
    int idade;
    String endereco;
    
    // Construtor
    public Cliente(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    // Métodos
    public void fazerCompras() {
        System.out.println(nome + " está fazendo compras.");
    }
    
    public void solicitarSuporte() {
        System.out.println(nome + " está solicitando suporte.");
    }
    
    public void realizarPagamento() {
        System.out.println(nome + " está realizando um pagamento.");
    }
}

// Classe Paciente
class Paciente {
    // Atributos
    String nome;
    int idade;
    String doenca;
    
    // Construtor
    public Paciente(String nome, int idade, String doenca) {
        this.nome = nome;
        this.idade = idade;
        this.doenca = doenca;
    }
    
    // Métodos
    public void marcarConsulta() {
        System.out.println(nome + " está marcando uma consulta.");
    }
    
    public void fazerExame() {
        System.out.println(nome + " está fazendo um exame.");
    }
    
    public void receberDiagnostico() {
        System.out.println(nome + " está recebendo o diagnóstico.");
    }
}

// Classe ContaBancaria
class ContaBancaria {
    // Atributos
    String numeroConta;
    double saldo;
    Cliente titular;
    
    // Construtor
    public ContaBancaria(String numeroConta, double saldo, Cliente titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    // Métodos
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Novo saldo: " + saldo);
    }
    
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public void verificarSaldo() {
        System.out.println("Saldo da conta de " + titular.nome + ": " + saldo);
    }
}

// Classe PlanoSaude
class PlanoSaude {
    // Atributos
    Cliente cliente;
    String tipoPlano;
    double mensalidade;
    
    // Construtor
    public PlanoSaude(Cliente cliente, String tipoPlano, double mensalidade) {
        this.cliente = cliente;
        this.tipoPlano = tipoPlano;
        this.mensalidade = mensalidade;
    }
    
    // Métodos
    public void pagarMensalidade() {
        System.out.println("Pagamento da mensalidade do plano de saúde de " + cliente.nome + " no valor de " + mensalidade + ".");
    }
    
    public void marcarConsulta() {
        System.out.println(cliente.nome + " está marcando uma consulta pelo plano de saúde.");
    }
    
    public void solicitarReembolso() {
        System.out.println(cliente.nome + " está solicitando re