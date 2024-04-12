package br.edu.up.models;

public class Logistica {
    private double[] precoCusto = new double[40];
    private double[] precoVenda = new double[40];
    private double somaPrecoCusto=0;
    private double somaPrecoVenda=0;
    private String situacao;


    public void analisarLucroPrej(int i){
        if (precoCusto[i] < precoVenda[i]) {
            situacao = "Houve lucro!!\n";
        }else if(precoCusto[i] > precoVenda[i]){
            situacao = "Houve prejuízo!!\n";
        }else if(precoCusto[i] == precoVenda[i]){
            situacao = "Houve empate!!\n";
        }
        
    }

    public void setPrecoCusto(int num, double precoCusto) {
        this.precoCusto[num] = precoCusto;
    }

    public double getPrecoCusto(int num) {
        return precoCusto[num];
    }

    public void setSomaPrecoCusto(double PrecoCusto) {
        this.somaPrecoCusto += PrecoCusto;
    }

    public void setPrecoVenda(int num, double precoVenda) {
        this.precoVenda[num] = precoVenda;
    }

    public double getPrecoVenda(int num) {
        return precoVenda[num];
    }

    public void setSomaPrecoVenda(double PrecoVenda) {
        this.somaPrecoVenda += PrecoVenda;
    }

    public String getSituacao() {
        return situacao;
    }

    public double getSomaPrecoCusto() {
        return somaPrecoCusto;
    }

    public double getSomaPrecoVenda() {
        return somaPrecoVenda;
    }
    
    
    
}
