package br.edu.up.models;

public class Salario {
    private double[] salarioInicial = new double[5];
    private double[] salarioFinal = new double[5];
    private double salarioMinimo;

    public void ajusteSalario(int i) {

        double tresSalariosMin = salarioMinimo * 3;
        double dezSalariosMin = salarioMinimo * 10;
        double vinteSalariosMin = salarioMinimo * 20;

        if (salarioInicial[i] < tresSalariosMin) {
            salarioFinal[i] = salarioInicial[i] * 1.50;

        } else if (salarioInicial[i] <= dezSalariosMin) {
            salarioFinal[i] = salarioInicial[i] * 1.20;

        } else if (salarioInicial[i] < vinteSalariosMin && salarioInicial[i] > dezSalariosMin) {
            salarioFinal[i] = salarioInicial[i] * 1.15;

        } else {
            salarioFinal[i] = salarioInicial[i] * 1.10;
        }

    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double getSalarioInicial(int num) {
        return salarioInicial[num];
    }

    public void setSalarioInicial(int num, double salarioInicial) {
        if (salarioInicial <= 0) {
            System.out.println("Salário inválido!!!");
        } else {
            this.salarioInicial[num] = salarioInicial;
        }
    }

    public double getSalarioFinal(int num) {
        return salarioFinal[num];
    }
}
