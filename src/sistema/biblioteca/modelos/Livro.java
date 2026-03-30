package sistema.biblioteca.modelos;

public class Livro implements ItemAcervo  {
    private final String titulo;
    private final String editora;
    private final int numeroPaginas;
    private boolean disponibilidade;

    public Livro(String titulo, String editora, int numeroPaginas, boolean disponibilidade) {
        this.titulo = titulo;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
        this.disponibilidade = disponibilidade;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getEditora() {
        return editora;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void exibeLivro() {
        System.out.println("-".repeat(40));
        System.out.println("Título do Livro: " + getTitulo());
        System.out.println("Editora: " + getEditora());
        System.out.println("Número de páginas: " + getNumeroPaginas());
        System.out.println("Livro disponível: " + isDisponibilidade());
    }
}
