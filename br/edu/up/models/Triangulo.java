package br.edu.up.models;

public class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;
    private String tipoTriangulo;

    public void verificarLados() {

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado1 == lado3) {
                tipoTriangulo = "Os lados foram um triãngulo EQUILÁTERO!! e também ISÓSCELE!!";
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                tipoTriangulo = "Os lados formam um triãngulo ISÓSCELE!!";
            } else {
                tipoTriangulo = "Os lados formam um triãngulo ESCALENO!!";
            }
        } else {
            tipoTriangulo = "Os lados fornecidos não formam um triângulo";
        }
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public String getTipoTriangulo() {
        return tipoTriangulo;
    }

}
