public class Exercicio11 {
    public static void executar(){
        System.out.println("--- Lista de nome sexo das pessoas ---");
        System.out.println("Digite o nome e sexo(M ou F) das pessoas: ");
        NomeSex nomeSex = new NomeSex();
        for(int i=0; i <56; i++){
            System.out.printf("Nome da %d° pessoa: ", (i+1));
            nomeSex.nome[i] = Prompt.lerLinha();
            System.out.printf("Sexo da %d° pessoa: ", (i+1));
            nomeSex.sexo[i] = Prompt.lerLinha();
        }
        nomeSex.contarSexos();
        System.out.println("--- Impressão dos dados das pessoas ---");
        for(int i=0; i<56; i++){
            System.out.printf("Nome [%d]: %s\n",(i+1), nomeSex.nome[i]);
            System.out.printf("Sexo [%d]: %s\n\n", (i+1), nomeSex.sexo[i]);
        }
        System.out.printf("Ao todo, tem %d homens e %d mulheres na lista.\n", nomeSex.qtdM, nomeSex.qtdF);
    }
}
