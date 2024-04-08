package br.edu.up.models;

public class DadosFuncionario {
    public String[] nome = new String[8];
    public double[] salarioInicial = new double[8];
    public double[] salarioFinal = new double[8];
    public double salarioMinimo;
    double totalReajuste = 0;

    public void ajusteSalario(int i) {

        double tresSalariosMin = salarioMinimo * 3;
        double dezSalariosMin = salarioMinimo * 10;
        double vinteSalariosMin = salarioMinimo * 20;

        if (salarioInicial[i] < tresSalariosMin) {
            salarioFinal[i] = salarioInicial[i] * 1.50;
            totalReajuste += (salarioInicial[i] * 1.50) - salarioInicial[i];

        } else if (salarioInicial[i] <= dezSalariosMin) {
            salarioFinal[i] = salarioInicial[i] * 1.20;
            totalReajuste += (salarioInicial[i] * 1.20) - salarioInicial[i];

        } else if (salarioInicial[i] < vinteSalariosMin && salarioInicial[i] > dezSalariosMin){
            salarioFinal[i] = salarioInicial[i] * 1.15;
            totalReajuste += (salarioInicial[i] * 1.15) - salarioInicial[i];
            
        } else {
            salarioFinal[i] = salarioInicial[i] * 1.10;
            totalReajuste += (salarioInicial[i] * 1.10) - salarioInicial[i];
        }

    }
}
