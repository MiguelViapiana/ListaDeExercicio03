public class DadosFuncionario {
    public String[] nome = new String[8];
    public double[] salarioInicial = new double[8];
    public double[] salarioFinal = new double[8];
    public double salarioMinimo;

    public void ajusteSalario(){
        System.out.println("Digite o salário mínimo: ");
        salarioMinimo = Prompt.lerDecimal();

        double tresSalariosMin = salarioMinimo * 3;
        double dezSalariosMin = salarioMinimo * 10;
        double vinteSalariosMin = salarioMinimo * 20;
        double totalReajuste=0;

        for(int i =0; i < 8; i++){
            System.out.printf("Digite o nome do %d° funcionário: ", (i+1));
            nome[i] = Prompt.lerLinha();

            System.out.printf("Digite o salário do %d° funcionário: ", (i+1));
            salarioInicial[i] = Prompt.lerDecimal();

            if(salarioInicial[i] < tresSalariosMin)
            {
                salarioFinal[i] = salarioInicial[i] * 1.50;
                totalReajuste += (salarioInicial[i] * 1.50)-salarioInicial[i];
            }else if (salarioInicial[i] <= dezSalariosMin)
            {
                salarioFinal[i] = salarioInicial[i] * 1.20;
                totalReajuste += (salarioInicial[i] * 1.20)-salarioInicial[i];
            }else if(salarioInicial[i] < vinteSalariosMin && salarioInicial[i] > dezSalariosMin)
            {
                salarioFinal[i] = salarioInicial[i] * 1.15;
                totalReajuste += (salarioInicial[i] * 1.15)-salarioInicial[i];
            }else
            {
                salarioFinal[i] = salarioInicial[i] * 1.10;
                totalReajuste += (salarioInicial[i] * 1.10)-salarioInicial[i];
            }
        }
        System.out.println("\n--- Salário Ajustado ---\n");
        for(int i=0; i < 8; i++){
            System.out.printf("Funcionario[%d]: Nome: %s | Salario inicial: R$ %.2f | Salario final: R$ %.2f\n",(i+1),nome[i], salarioInicial[i], salarioFinal[i]);
        }
        System.out.printf("A empresa vai aumentar R$ %.2f na folha de pagamento!", totalReajuste);

    }
}

