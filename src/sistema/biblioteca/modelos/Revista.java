package sistema.biblioteca.modelos;

public class Revista implements ItemAcervo{
    private String titulo;
    private int volume;
    private String edicao;
    private String periodicidade;
    private boolean disponibilidade;

    public Revista(String titulo,String edicao, int volume, String periodicidade, boolean disponibilidade) {
        this.titulo = titulo;
        this.edicao = edicao;
        this.volume = volume;
        this.periodicidade = periodicidade;
        this.disponibilidade = disponibilidade;
    }

    public int getVolume() {
        return volume;
    }

    public String getEdicao() {
        return edicao;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void exibeRevista() {
        System.out.println("-".repeat(40));
        System.out.println("Título: " + getTitulo());
        System.out.println("Edição: " + getEdicao());
        System.out.println("Volume: " + getVolume());
        System.out.println("Periodicidade: " + getPeriodicidade());
        System.out.println("Revista disponível: " + isDisponivel());
    }
}
