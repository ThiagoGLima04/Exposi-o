import java.util.ArrayList;

class Usuario {
    private String nome;
    private String endereco;
    private String tipo; // Pode ser "Professor", "Aluno" ou "Funcionário"
    private String departamento; // Válido apenas para professores e funcionários

    public Usuario(String nome, String endereco, String tipo) {
        this.nome = nome;
        this.endereco = endereco;
        this.tipo = tipo;
    }

    public void setDepartamento(String departamento) {
        if (this.tipo.equals("Professor") || this.tipo.equals("Funcionário")) {
            this.departamento = departamento;
        } else {
            System.out.println("Apenas professores e funcionários podem ter um departamento.");
        }
    }

    // Métodos getters e setters para os atributos
}

class Obra {
    private String titulo;
    private String categoria;
    private String lingua;
    private String midia;
    private ArrayList<String> autores;
    private ArrayList<String> nacionalidadesAutores;
    private ArrayList<String> editoras;
    private ArrayList<Integer> anosEdicao;

    public Obra(String titulo, String categoria, String lingua, String midia) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.lingua = lingua;
        this.midia = midia;
        this.autores = new ArrayList<>();
        this.nacionalidadesAutores = new ArrayList<>();
        this.editoras = new ArrayList<>();
        this.anosEdicao = new ArrayList<>();
    }

    public void adicionarAutor(String autor, String nacionalidade) {
        autores.add(autor);
        nacionalidadesAutores.add(nacionalidade);
    }

    public void adicionarEditora(String editora, int anoEdicao) {
        editoras.add(editora);
        anosEdicao.add(anoEdicao);
    }

}

class Emprestimo {
    private Usuario usuario;
    private Obra obra;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Usuario usuario, Obra obra, String dataEmprestimo, String dataDevolucao) {
        this.usuario = usuario;
        this.obra = obra;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

}

public class BibliotecaUniversitaria {
    public static void main(String[] args) {

        Obra livro1 = new Obra("Introduction to Algorithms", "Livro científico", "Inglês", "Papel");
        livro1.adicionarAutor("Thomas H. Cormen", "Estados Unidos");
        livro1.adicionarAutor("Charles E. Leiserson", "Estados Unidos");
        livro1.adicionarAutor("Ronald L. Rivest", "Estados Unidos");
        livro1.adicionarAutor("Clifford Stein", "Estados Unidos");
        livro1.adicionarEditora("MIT Press", 1990);

  
        Obra revista1 = new Obra("Nature", "Periódico científico", "Inglês", "Online");
        revista1.adicionarAutor("Vários autores", "Diversos países");
        revista1.adicionarEditora("Nature Publishing Group", 1869);

    
        Usuario usuario1 = new Usuario("João", "Rua A, 123", "Professor");
        usuario1.setDepartamento("Departamento de Informática");

    
        Emprestimo emprestimo1 = new Emprestimo(usuario1, livro1, "2024-03-25", "2024-04-25");
    }
}