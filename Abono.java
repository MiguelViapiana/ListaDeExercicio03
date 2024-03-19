public class Abono {
    public String nome;
    public String sexo;
    public int idade;
    public double salarioFixo;
    public double salarioLiquido;

    public void calcAbono(){
        nome = Prompt.lerLinha("Digite o seu nome: ");
        sexo = Prompt.lerLinha("Digite o sexo (M ou F)");
        idade = Prompt.lerInteiro("Digite a sua idade: ");
        if(!sexo.equals("M") && !sexo.equals("F")){
            System.out.println("Sexo inválido!!");
        }
        salarioFixo = Prompt.lerDecimal("Digite o salário fixo: ");
        if (sexo.equals("M")) {
            if (idade >= 30) {
                salarioLiquido = salarioFixo + 100;
            }else{
                salarioLiquido = salarioFixo + 50;
            }
        }
        if (sexo.equals("F")) {
            if (idade >= 30) {
                salarioLiquido = salarioFixo + 200;
            }else{
                salarioLiquido = salarioFixo + 80;
            }
        }
        System.out.printf("Nome: %s\nIdade: %d\nSexo: %s\nSalario Fixo: R$ %.2f\nSalario Liquido: R$ %.2f",nome, idade, sexo, salarioFixo, salarioLiquido);
    }
}
