package br.com.fiap.cap8.model;

public class Avaliacao extends Pessoa {
    private int nota;
    private String comentario;
    private String dataAvaliacao;

    public Avaliacao() {}

    public Avaliacao(String nomeUsuario, int nota, String comentario, String dataAvaliacao) {
        super(nomeUsuario);
        this.nota = nota;
        this.comentario = comentario;
        this.dataAvaliacao = dataAvaliacao;
    }

    public void registrarAvaliacao() {
        System.out.println("Avaliação registrada:");
        System.out.println("Usuário: " + getNome());
        System.out.println("Nota: " + nota);
        System.out.println("Comentário: " + comentario);
        System.out.println("Data: " + dataAvaliacao);
    }

    public void exibirAvaliacao() {
        System.out.println("Avaliação do usuário " + getNome());
        System.out.println("Nota: " + nota);
        System.out.println("Comentário: " + comentario);
        System.out.println("Data da Avaliação: " + dataAvaliacao);
    }
}
