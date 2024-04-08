package br.edu.up.models;

public class Carro {
    private double distanciaTotal;
    private double totalDeCombustivel;
    private double consumoMedio;

    public void calcConsumoMedio(){
        consumoMedio = distanciaTotal/totalDeCombustivel;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public void setTotalDeCombustivel(double totalDeCombustivel) {
        this.totalDeCombustivel = totalDeCombustivel;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }
    
    

        
}