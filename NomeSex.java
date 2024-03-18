public class NomeSex {
   public String[] nome = new String[56];
   public String[] sexo = new String[56];
   public int qtdM=0;
   public int qtdF;

   public void inserirNomeSex(){
        System.out.println("Digite o nome e sexo(M ou F) das pessoas: ");
        for(int i=0; i <56; i++){
            System.out.printf("Nome da %d° pessoa: ", (i+1));
            nome[i] = Prompt.lerLinha();
            System.out.printf("Sexo da %d° pessoa: ", (i+1));
            sexo[i] = Prompt.lerLinha();
            if (!sexo[i].equals("M") && !sexo[i].equals("F")) {
                System.out.println("Sexo inválido digite M ou F");
            } else if (sexo[i].equals("M")) {
                qtdM++;
            }else if(sexo[i].equals("F")){
                qtdF++;
            }
        }
   }
   public void imprimirNomeSexo(){
        for(int i=0; i<56; i++){
            System.out.printf("Nome [%d]: %s\n",(i+1), nome[i]);
            System.out.printf("Sexo [%d]: %s\n\n", (i+1), sexo[i]);
        }
        System.out.printf("Ao todo, tem %d homens e %d mulheres na lista.", qtdM, qtdF);
   }
}
