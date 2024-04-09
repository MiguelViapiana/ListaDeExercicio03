package br.edu.up.models;

public class Carango {
  private double precoCarro;
  private double desconto;
  private String combustivel;
  private double precoFinal;

  public void calcDesconto() {
    if (combustivel.equals("alcool")) {
      desconto = 0.25;
    } else if (combustivel.equals("gasolina")) {
      desconto = 0.21;
    } else if (combustivel.equals("diesel")) {
      desconto = 0.14;
    }
  }

  public void calcPrecoFinal() {
    precoFinal = precoCarro - precoCarro * desconto;
  }

  public void setPrecoCarro(double precoCarro) {

    this.precoCarro = precoCarro;
  }

  public void setCombustivel(String combustivel) {
    if (!combustivel.equals("alcool") && !combustivel.equals("gasolina") && !combustivel.equals("diesel")) {
      System.out.println("Combustível inváliudo!!!");
    } else {
      this.combustivel = combustivel;
    }
  }

  public double getPrecoCarro() {
    return precoCarro;
  }

  public double getDesconto() {
    return desconto;
  }

  public double getPrecoFinal() {
    return precoFinal;
  }

}
