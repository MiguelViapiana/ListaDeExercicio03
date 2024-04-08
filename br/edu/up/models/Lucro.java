package br.edu.up.models;

public class Lucro {
    private double precoDeCusto;
    private double acresimo;
    private double valorFinal;

    public void calcLucro(){
        valorFinal = precoDeCusto+(precoDeCusto * (acresimo/100));
    }

    public void setPrecoDeCusto(double precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public void setAcresimo(double acresimo) {
        this.acresimo = acresimo;
    }

    public double getValorFinal() {
        return valorFinal;
    }
    
}
