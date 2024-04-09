package br.edu.up.models;

public class DadosFuncionario {
    private String[] nome = new String[8];
    private double[] salarioInicial = new double[8];
    private double[] salarioFinal = new double[8];
    private double salarioMinimo;
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

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public String getNome(int num) {
        return nome[num];
    }

    public void setNome(int num,String nome) {
        this.nome[num] = nome;
    }

    public double getSalarioInicial(int num) {
        return salarioInicial[num];
    }

    public void setSalarioInicial(int num, double salarioInicial) {
        this.salarioInicial[num] = salarioInicial;
    }


    public double getSalarioFinal(int num) {
        return salarioFinal[num];
    }

    public double getTotalReajuste() {
        return totalReajuste;
    }
    

    
    
}
