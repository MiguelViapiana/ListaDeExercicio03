public class Lucro {
    public double precoDeCusto;
    public double acresimo;
    public double valorFinal;

    public void calcLucro(double precoCusto, double acres){
        valorFinal = precoCusto+(precoCusto * (acres/100));
    }
}
