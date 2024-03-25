public class Exercicio03 {
    public static void executar(){
        Vendedor vendedor = new Vendedor();
        System.out.println("Digite os dados do vendedor: ");
        vendedor.nome = Prompt.lerLinha("Nome: ");
        vendedor.salFix = Prompt.lerDecimal("Salário fixo: ");
        vendedor.totalVendas = Prompt.lerInteiro("Total de vendas(em dinheiro): ");
        vendedor.calcSalFinal();

        System.out.printf("Nome: %s\nSalário fixo: %.2f\nSalário final: %.2f", vendedor.nome, vendedor.salFix, vendedor.salFinal);
    }
}

