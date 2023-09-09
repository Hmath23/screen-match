package br.com.alura.screenmatch.modelos;

public class Titulo  {
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaNotas;
    private int totalDeAvaliacoes;
    private int duracaoMinutos;

    public void setNome(String nome) { this.nome = nome; }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }

    public void avalia(double nota) {
        somaNotas += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaNotas / totalDeAvaliacoes;
    }
}
