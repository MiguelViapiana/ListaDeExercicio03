public class Salario {
    public double[] salarioInicial = new double[584];
    public double[] salarioFinal = new double[584];
    public double salarioMinimo;

    public void ajusteSalario(){
        System.out.println("Digite o salário mínimo: ");
        salarioMinimo = Prompt.lerDecimal();

        double tresSalariosMin = salarioMinimo * 3;
        double dezSalariosMin = salarioMinimo * 10;
        double vinteSalariosMin = salarioMinimo * 20;

        for(int i =0; i < 584; i++){
            System.out.printf("Digite o salário do %d° funcionário: ", (i+1));
            salarioInicial[i] = Prompt.lerDecimal();

            if(salarioInicial[i] < tresSalariosMin)
            {
                salarioFinal[i] = salarioInicial[i] * 1.50;
            }else if (salarioInicial[i] <= dezSalariosMin)
            {
                salarioFinal[i] = salarioInicial[i] * 1.20;
            }else if(salarioInicial[i] < vinteSalariosMin && salarioInicial[i] > dezSalariosMin)
            {
                salarioFinal[i] = salarioInicial[i] * 1.15;
            }else
            {
                salarioFinal[i] = salarioInicial[i] * 1.10;
            }
        }
        System.out.println("\n--- Salário Ajustado ---\n");
        for(int i=0; i < 584; i++){
            System.out.printf("Funcionario[%d]: Salario inicial: R$ %.2f  Salario final: R$ %.2f\n", (i+1), salarioInicial[i], salarioFinal[i]);
        }

    }
}
