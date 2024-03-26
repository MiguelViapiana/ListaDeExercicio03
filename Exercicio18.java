public class Exercicio18 {
    public static void executar(){
        System.out.println("--- Calculo de Abono salarial ---");
        Abono abono = new Abono();
        abono.nome = Prompt.lerLinha("Digite o seu nome: ");
        abono.sexo = Prompt.lerLinha("Digite o sexo (M ou F)");
        if(!abono.sexo.equals("M") && !abono.sexo.equals("F")){
            System.out.println("Sexo inválido!!");
        }
        abono.idade = Prompt.lerInteiro("Digite a sua idade: ");
        abono.salarioFixo = Prompt.lerDecimal("Digite o salário fixo: ");
        abono.calcAbono();
        System.out.printf("Nome: %s\nIdade: %d\nSexo: %s\nSalario Fixo: R$ %.2f\nSalario Liquido: R$ %.2f\n",abono.nome, abono.idade, abono.sexo, abono.salarioFixo, abono.salarioLiquido);
    }
}
