public class Imposto {
    public double precoDeFabrica;
    public double precoComImposto;
    public double precoFinal;

    public void calcPrecoFinal(double precoFab){
        precoComImposto = precoFab * 1.45;
        precoFinal = precoComImposto * 1.28;
    }
}
