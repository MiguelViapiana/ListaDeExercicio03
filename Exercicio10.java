public class Exercicio10 {
    public static void executar(){
        IdadeVerif idade = new IdadeVerif();
        System.out.println("---Verificador de Idades ---");
        System.out.println("Digite quantas pessoas quer analisar: ");
        idade.i = Prompt.lerInteiro();
        System.out.println("Digite as idades das pessoas: ");
        idade.idade = new int[idade.i];
        for(int p =0; p<idade.i; p++){
            System.out.printf("%d° pessoa: ",  (p+1));
            idade.idade[p] = Prompt.lerInteiro();
        }
        idade.verificarIdades();
        idade.maiorMenor = new String[idade.i];
        for(int p =0; p < idade.i; p++){
            System.out.printf("A pessoa [%d] é %s\n", idade.i, idade.maiorMenor);
        }
        
        
    }
}
