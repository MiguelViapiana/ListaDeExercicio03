public class IdadeVerif {
    public int i;
    public int[] idade;

    public void lerIdades(){
        System.out.println("Digite quantas pessoas quer analisar: ");
        i = Prompt.lerInteiro();
        System.out.println("Digite as idades das pessoas: ");
        idade = new int[i];
        for(int p =0; p<i; p++){
            System.out.printf("%d° pessoa: ",  (p+1));
            idade[p] = Prompt.lerInteiro();
        }
    }
    public void verificarIdades(){
        System.out.println("------------------\n");
        for(int p =0; p < i; p++){
            if (idade[p] < 18) {
                System.out.printf("Pessoa [%d] é MENOR DE IDADE!\n", (p+1));
            }else{
                System.out.printf("Pessoa [%d] é MAIOR DE IDADE!\n", (p+1));
            }
        }
    }

}
