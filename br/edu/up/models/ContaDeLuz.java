package br.edu.up.models;

public class ContaDeLuz {
    private int tipoDeCliente;
    private int KWH;
    private double contaFinal;

    public void calcContaDeLuz() {

        if (tipoDeCliente == 1) {
            contaFinal = KWH * 0.60;
        } else if (tipoDeCliente == 2) {
            contaFinal = KWH * 0.48;
        } else {
            contaFinal = KWH * 1.29;
        }
    }

    public void setTipoDeCliente(int tipoDeCliente) {
        if (tipoDeCliente == 1 || tipoDeCliente == 2 || tipoDeCliente == 3) {
            this.tipoDeCliente = tipoDeCliente;
        } else {
            System.out.println("Tipo de cliente inválido!");
        }
    }

    public void setKWH(int kWH) {
        if (kWH < 0) {
            System.out.println("Velocidade inválida");
        }else{
            KWH = kWH;
        }
    }

    public double getContaFinal() {
        return contaFinal;
    }
    


}
