import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setAnoDeLancamento(2000);
        meuFilme.setNome("Carros");
        meuFilme.setDuracaoEmMinutos(180);

        Filme outroFilme = new Filme();

        outroFilme.setAnoDeLancamento(2000);
        outroFilme.setNome("Avatar");
        outroFilme.setDuracaoEmMinutos(100);

        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Nota média do filme: " + meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2007);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da série em minutos " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(meuFilme);
        filtro.filtra(outroFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setTotalVisualizacoes(150);
        episodio.setSerie(lost);
        filtro.filtra(episodio);
    }
}
