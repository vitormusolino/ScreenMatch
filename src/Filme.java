public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        System.out.println("Avaliação: "+ somaAvaliacao);
    }

    void avalia(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacao/totalDeAvaliacoes;
    }

}
