package sistema.biblioteca.modelos;

public class DVD implements ItemAcervo {
    private String titulo;
    private int duracao;
    private String diretor;
    private int classificacao;
    private boolean disponibilidade;

    public DVD(String titulo, int duracao, String diretor, int classificacao, boolean disponibilidade) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.diretor = diretor;
        this.classificacao = classificacao;
        this.disponibilidade = disponibilidade;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getClassificacao() {
        return classificacao;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void exibeDVD() {
        System.out.println("-".repeat(40));
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração em minutos: " + getDuracao());
        System.out.println("Diretor: " + getDiretor());
        System.out.println("Classificação: " + getClassificacao());
        System.out.println("DVD disponível: " + isDisponivel());
    }
}
