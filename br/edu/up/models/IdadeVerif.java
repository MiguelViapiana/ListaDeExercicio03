package br.edu.up.models;

public class IdadeVerif {
    public int i;
    public int[] idade;
    public String[] maiorMenor;

    public void verificarIdades(){
        maiorMenor = new String[idade.length];
        for(int p =0; p < i; p++){
            if (idade[p] < 18) {
                maiorMenor[p] = "MENOR";   
            }else{
                maiorMenor[p] = "MAIOR";
            }
        }
    }

}
