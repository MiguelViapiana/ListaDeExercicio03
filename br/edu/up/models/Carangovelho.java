package br.edu.up.models;

public class Carangovelho {
    private int totalCarrosAte2000 = 0;
    private int totalGeral = 0;
    private double valor;
    private double valorFinal;
    private int ano;
    private double descontos;
    private String continuar;

    public void gerarDesconto() {

        if (ano >= 2000) {
            descontos = 0.12;
            totalCarrosAte2000++;
        } else {
            descontos = 0.07;
        }
        descontos = valor * descontos;

    }  

    public void gerarValorFinal(){
        valorFinal = valor -(descontos);
        totalGeral++;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public double getDescontos() {
        return descontos;
    }

    
    public void setContinuar(String continuar) {
        this.continuar = continuar;
    }

    public String getContinuar() {
        return continuar;
    }

    public int getTotalCarrosAte2000() {
        return totalCarrosAte2000;
    }

    public int getTotalGeral() {
        return totalGeral;
    }
    
    

}
