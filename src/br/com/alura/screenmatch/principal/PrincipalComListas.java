package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.avalia(10);
        Filme meuFilme = new Filme("Carros",2000);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2002);
        outroFilme.avalia(8);
        Serie lost = new Serie("Lost",2007);

        ArrayList<Titulo> listaAssistidos = new ArrayList<>();
        listaAssistidos.add(filmeDoPaulo);
        listaAssistidos.add(meuFilme);
        listaAssistidos.add(outroFilme);
        listaAssistidos.add(lost);

        for (Titulo item: listaAssistidos){
            if(item instanceof Filme filme){
                System.out.println("Classificacao " + filme.getClassificacao());
            }else{
                System.out.println("Série sem avaliação");
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Vitor");
        buscaPorArtista.add("Heloisa");
        buscaPorArtista.add("Caio");
        buscaPorArtista.add("Gabriel");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
        Collections.sort(listaAssistidos);
        System.out.println(listaAssistidos);
        listaAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaAssistidos);
    }
}
