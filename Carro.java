public class Carro {
    public double distanciaTotal;
    public double totalDeCombustivel;
    public double consumoMedio;

    public void calcConsumoMedio(){
        consumoMedio = distanciaTotal/totalDeCombustivel;
    }

        
}