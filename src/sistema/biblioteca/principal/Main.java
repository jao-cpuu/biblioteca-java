package sistema.biblioteca.principal;

import sistema.biblioteca.modelos.*;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("João Pedro", "joaopedro@gmail.com", "3498732094", 23, 5);


        usuario1.exibirUsuario();

        Funcionario funcionario1 = new Funcionario("Fátima", "fatima@gmail.com", "3499323409", "Supervisora", 29);

        funcionario1.exibefuncionario();

        Livro livro1 = new Livro("Harry - Potter", "Warner Bros", 260, true);
        livro1.exibeLivro();


        Revista revistas = new Revista("Tech - IA","Veja", 24, "Semestral", true);
        revistas.exibeRevista();


        DVD dvds = new DVD("Homem-Aranha",140, "Sami Rami", 14, true);
        dvds.exibeDVD();

    }
}
