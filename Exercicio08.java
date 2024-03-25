public class Exercicio08 {
    public static void executar(){
        TesteDeAprovacao aprov = new  TesteDeAprovacao();
        System.out.println("Digite o nome: ");
        aprov.nome = Prompt.lerLinha();
        System.out.println("digte 3 notas: ");
        aprov.nota1 = Prompt.lerDecimal();
        aprov.nota2 = Prompt.lerDecimal();
        aprov.nota3 = Prompt.lerDecimal();
        aprov.calcMedia();
        System.out.println("Nome: "+ aprov.nome);
        System.out.println(aprov.situacao);
    }
}
