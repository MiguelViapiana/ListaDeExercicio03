package br.edu.up.models;

public class Dolar {
    private double cotação;
    private double qtdDol;
    private double valorFinal;

    public void conversãoDolar(){
        valorFinal = qtdDol * cotação;
    }

    public void setCotação(double cotação) {
        this.cotação = cotação;
    }

    public void setQtdDol(double qtdDol) {
        this.qtdDol = qtdDol;
    }

    public double getValorFinal() {
        return valorFinal;
    }
    
}
