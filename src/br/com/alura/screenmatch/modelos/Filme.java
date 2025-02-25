package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    public int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacoes;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        System.out.println("Avaliação: "+ somaAvaliacao);
    }

    public void avalia(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacao/totalDeAvaliacoes;
    }

}
