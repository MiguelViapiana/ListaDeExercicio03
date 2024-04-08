package br.edu.up.models;

public class Imposto {
    public double precoDeFabrica;
    public double precoComImposto;
    public double precoFinal;

    public void calcPrecoFinal(){
        precoComImposto = precoDeFabrica * 1.45;
        precoFinal = precoComImposto * 1.28;
    }

    public void setPrecoDeFabrica(double precoDeFabrica) {
        this.precoDeFabrica = precoDeFabrica;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }
    
}
