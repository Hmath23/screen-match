import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filmeUm = new Filme();

        filmeUm.setNome("Homem-Aranha: Através do Aranhaverso");
        filmeUm.setAnoLancamento(2023);
        filmeUm.setDuracaoMinutos(140);

        Filme filmeDois = new Filme();

        filmeDois.setNome("Top Gun: Maverick");
        filmeDois.setAnoLancamento(2022);
        filmeDois.setDuracaoMinutos(131);

        filmeUm.avalia(8.0);
        filmeUm.avalia(10);
        filmeUm.avalia(8.0);
        System.out.println("Nota final: " + filmeUm.pegaMedia());
        System.out.println("Total de avaliações: " + filmeUm.getTotalDeAvaliacoes());

        Serie serieUm = new Serie();

        serieUm.setNome("Supernatural");
        serieUm.setAnoLancamento(2005);
        serieUm.setTemporadas(17);
        serieUm.setMinutosPorEpisodio(50);
        serieUm.setEpisodiosPorTemporada(23);

        serieUm.exibeFichaTecnica();

        System.out.println("Duração em minutos para maratonar " + serieUm.getNome() + ": " + serieUm.getDuracaoMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmeUm);
        calculadora.inclui(filmeDois);
        calculadora.inclui(serieUm);
        System.out.println(calculadora.getTempoTotal());
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra((filmeUm));

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serieUm);
        episodio.setTotalVisualizacoes(150);
        filtro.filtra(episodio);

    }

}