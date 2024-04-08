package br.edu.up.models;

public class Carangovelho {
    public int totalCarrosAte2000 = 0;
    public int totalGeral = 0;
    public double valor;
    public double valorFinal;
    public int ano;
    public double descontos;
    public String continuar;

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

}
