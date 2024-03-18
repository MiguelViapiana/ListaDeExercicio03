public class Exercicio13 {
    public static void executar(){
        System.out.println("--- Alistamento Militar ---");
        AlistamentoMilitar alistamento = new AlistamentoMilitar();
        System.out.println("Quantas pessoas quer inserir no sistema? ");
        alistamento.qtdpessoas=Prompt.lerInteiro();
        alistamento.InserirDados(alistamento.qtdpessoas);
        System.out.println("A quantidade de pessoas aptas são de: "+ alistamento.qtdAptas);
    }
}
