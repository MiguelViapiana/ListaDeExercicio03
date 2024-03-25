public class IdadeVerif {
    public int i;
    public int[] idade;
    public String[] maiorMenor;

    public void verificarIdades(){
        for(int p =0; p < i; p++){
            if (idade[p] < 18) {
                maiorMenor[p] = "MENOR DE IDADE!";   
            }else{
                maiorMenor[p] = "MAIOR DE IDADE!";
            }
        }
    }

}
