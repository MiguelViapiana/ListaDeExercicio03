public class Triangulo {
    public int lado1;
    public int lado2;
    public int lado3;

    public void verificarLados(){
        lado1 = Prompt.lerInteiro("Digite o primeiro lado: ");
        lado2 = Prompt.lerInteiro("Digite o segundo lado: ");
        lado3 = Prompt.lerInteiro("Digite o terceiro lado: ");

        if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
            if(lado1 == lado2 && lado1 == lado3){
                System.out.println("Os lados foram um triãngulo EQUILÁTERO!! e também ISÓSCELE!!");
            }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Os lados formam um triãngulo ISÓSCELE!!");
            }else{
                System.out.println("Os lados formam um triãngulo ESCALENO!!");
            }
        }else{
            System.out.println("Os lados fornecidos não formam um triângulo");
        }
    }
}
