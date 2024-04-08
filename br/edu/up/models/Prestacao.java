package br.edu.up.models;

public class Prestacao {
    private double valorFinalCompra;
    private double prestação;

    public void valorPrestação(){
        prestação = valorFinalCompra/5;
    }

    public void setValorFinalCompra(double valorFinalCompra) {
        this.valorFinalCompra = valorFinalCompra;
    }

    public double getPrestação() {
        return prestação;
    }
    
    
}
