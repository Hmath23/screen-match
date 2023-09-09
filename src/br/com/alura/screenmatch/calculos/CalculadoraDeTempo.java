package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        //System.out.println("adicionanro duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoMinutos();
    }

    /*
    public void inclui(Filme f){
        this.tempoTotal += f.getDuracaoMinutos();
    }
    public void inclui(Serie s){
        this.tempoTotal += s.getDuracaoMinutos();
    }
    */
}