package sistema.biblioteca.modelos;

public class Usuario extends Pessoa {
    private int matricula;
    private int limiteEmprestimos = 5;

    public Usuario(String nome, String email, String telefone, int matricula, int limiteEmprestimos) {
        super(nome, email, telefone);
        this.matricula = matricula;
        this.limiteEmprestimos = limiteEmprestimos;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getLimiteEmprestimos() {
        return limiteEmprestimos;
    }

    public void exibirUsuario(){
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Empréstimos restantes: " + getLimiteEmprestimos());
    }

    public void pegaItem() {
        limiteEmprestimos--;
    }
}
