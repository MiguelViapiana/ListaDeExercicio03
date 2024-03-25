public class Lucro {
    public double precoDeCusto;
    public double acresimo;
    public double valorFinal;

    public void calcLucro(){
        valorFinal = precoDeCusto+(precoDeCusto * (acresimo/100));
    }
}
