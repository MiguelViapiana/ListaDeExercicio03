public class Triangulo {
    public int lado1;
    public int lado2;
    public int lado3;
    public String tipoTriangulo;

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
}
