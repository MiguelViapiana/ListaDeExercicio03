package br.edu.up.models;

public class Dolar {
    public double cotação;
    public double qtdDol;
    public double valorFinal;

    public void conversãoDolar(){
        valorFinal = qtdDol * cotação;
    }
}
