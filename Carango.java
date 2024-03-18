public class Carango {
    public double precoCarro;
    public double desconto;
    public String combustivel;
    public double precoFinal;

    public void inserirDados(){
              System.out.println("\nDigite o preço do carro: ");
              precoCarro = Prompt.lerDecimal();

              System.out.println("Qual tipo de combustível o carro usa(alcool, gasolina e diesel): ");
              combustivel = Prompt.lerLinha();
              if (!combustivel.equals("alcool")&& !combustivel.equals("gasolina")&&!combustivel.equals("diesel")) {
                System.out.println("Combustível inváliudo!!!");
              }else{
                if (combustivel.equals("alcool")) {
                    desconto = 0.25;
                }else if (combustivel.equals("gasolina")) {
                    desconto = 0.21;
                } else if (combustivel.equals("diesel")) {
                    desconto = 0.14;
                }
              }
              precoFinal = precoCarro - precoCarro * desconto;


    }
}
