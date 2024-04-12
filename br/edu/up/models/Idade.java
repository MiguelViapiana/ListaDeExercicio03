package br.edu.up.models;

public class Idade {
    private int i;
    private int[] idade;
    private String[] maiorMenor;

    public void verificarIdades(int[] idades){
        idade = idades;
        maiorMenor = new String[idade.length];
        for(int p =0; p < i; p++){
            if (idade[p] < 18) {
                maiorMenor[p] = "MENOR";   
            }else{
                maiorMenor[p] = "MAIOR";
            }
        }
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setIdade(int num,int idade) {
        this.idade[num] = idade;
    }

    public int getI() {
        return i;
    }

    public String getMaiorMenor(int num) {
        return maiorMenor[num];
    }
    
    


}
