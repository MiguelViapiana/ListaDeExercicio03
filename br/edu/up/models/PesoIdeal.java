package br.edu.up.models;

public class PesoIdeal {
    private String sexo;
    private double altura;
    private int idade;
    private double pesoIdeal;

    public void calcPesoIdeal() {

        if (sexo.equals("M")) {
            if (altura <= 1.70) {
                if (idade <= 40) {
                    pesoIdeal = (72.7 * altura) - 50;
                } else {
                    pesoIdeal = (72.9 * altura) - 58;
                }
            } else {
                if (idade <= 20) {
                    pesoIdeal = (72.7 * altura) - 58;
                } else if (idade <= 39) {
                    pesoIdeal = (72.7 * altura) - 53;
                } else {
                    pesoIdeal = (72.7 * altura) - 45;
                }
            }
        }
        if (sexo.equals("F")) {
            if (altura <= 1.50) {
                if (idade >= 35) {
                    pesoIdeal = (62.1 * altura) - 45;
                } else {
                    pesoIdeal = (62.1 * altura) - 49;
                }
            } else {
                pesoIdeal = (62.1 * altura) - 44.7;
            }
        }
    }

    public void setSexo(String sexo) {
        if (!sexo.equals("M") && !sexo.equals("F")) {
            System.out.println("Sexo Inváldio!!");
            this.sexo = "";
        } else {
            this.sexo = sexo;
        }

    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public double getPesoIdeal() {
        return pesoIdeal;
    }

}
