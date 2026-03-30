package sistema.biblioteca.modelos;

public class Funcionario extends Pessoa {
    private String cargo;
    private int matriculaFunc;

    public Funcionario(String nome, String email, String telefone, String cargo, int matriculaFunc) {
        super(nome, email, telefone);
        this.cargo = cargo;
        this.matriculaFunc = matriculaFunc;
    }

    public String getCargo() {
        return cargo;
    }

    public int getMatriculaFunc() {
        return matriculaFunc;
    }

    public void exibefuncionario() {
        System.out.println("-".repeat(40));
        System.out.println("Nome do funcionário: " + getNome());
        System.out.println("Email do funcionário(a): " + getEmail());
        System.out.println("Telefone do funcionário(a): " + getTelefone());
        System.out.println("Cargo do funcionário(a): " + getCargo());
        System.out.println("Matrícula do funcionário(a): " + getMatriculaFunc());
    }
}
