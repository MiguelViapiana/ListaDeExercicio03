public class AlistamentoMilitar {
    public String[] nome;
    public String[] sexo;
    public int[] idade;
    public int[] saude;
    public boolean[] apto;
    public int qtdpessoas;
    public int qtdAptas=0;

    public void InserirDados(int i){
        nome = new String[i];
        sexo = new String[i];
        idade = new int[i];
        saude = new int[i];
        apto = new boolean[i];
        for(int p =0; p<i; p++){
            System.out.printf("Digite o nome da %d° pessoa: ", (p+1));
            nome[p] = Prompt.lerLinha();

            System.out.printf("Digite o sexo da %d° pessoa (M ou F): ", (p+1));
            sexo[p] = Prompt.lerLinha();
            if (!sexo[p].equals("M")&& !sexo[p].equals("F")) {
                System.out.println("Sexo inválido!! Digite M ou F");
                break;
            }

            System.out.printf("Digite a idade da %d° pessoa: ", (p+1));
            idade[p] = Prompt.lerInteiro();
            if (idade[p] < 18) {
                apto[p] = false;
            }else{
                apto[p] = true;
            }

            System.out.println("Digite se a sua está boa ou ruim \n[1] Boa\n[2] Ruim");
            saude[p] = Prompt.lerInteiro();
            if (saude[p] == 1 && apto[p] == true) {
                apto[p] = true;
            }else if(saude[p] == 1 && apto[p] == false){
                apto[p] = false;
            }else if(saude[p] == 2){
                apto[p] = false;
            }else if (saude[p] != 1 && saude[p] != 2) {
                System.out.println("Entrada de dados inválida, tente novamente.");
                break;
            }


            if (apto[p] == true) {
                System.out.printf("A pessoa com nome [%s] está apta para sevir!!\n\n", nome[p]);
                qtdAptas++;
            }else{
                System.out.printf("A pessoa com nome [%s] NÂO está apta para sevir!!\n\n", nome[p]);
            }
        }
    }
}
