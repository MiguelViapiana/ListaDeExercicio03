package br.edu.up.models;

public class ProdutoLucroPrej {
    public double[] precoCusto = new double[40];
    public double[] precoVenda = new double[40];
    public double somaPrecoCusto=0;
    public double somaPrecoVenda=0;
    public String situacao;


    public void analisarLucroPrej(int i){
        if (precoCusto[i] < precoVenda[i]) {
            situacao = "Houve lucro!!\n";
        }else if(precoCusto[i] > precoVenda[i]){
            situacao = "Houve prejuízo!!\n";
        }else if(precoCusto[i] == precoVenda[i]){
            situacao = "Houve empate!!\n";
        }
        
    }
}
