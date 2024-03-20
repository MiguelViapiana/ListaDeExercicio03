public class PesoIdeal {
    public String sexo;
    public double altura;
    public int idade;
    public double pesoIdeal;

    public void calcPesoIdeal(){
        sexo = Prompt.lerLinha("Digite o sexo(M-F)");
        altura = Prompt.lerDecimal("Digite a sua altura(0.00)");
        idade = Prompt.lerInteiro("Digite a sua idade: ");
        if (!sexo.equals("M")&& !sexo.equals("F")) {
            System.out.println("Sexo Inváldio!!");
        }else{
            if (sexo.equals("M")) {
                if (altura <= 1.70) {
                    if (idade <=40) {
                        pesoIdeal = (72.7*altura) - 50;
                    }else{
                        pesoIdeal = (72.9*altura) - 58;
                    }
                }else{
                    if (idade <= 20) {
                        pesoIdeal = (72.7*altura)-58;
                    }else if (idade <=39) {
                        pesoIdeal = (72.7*altura) - 53;
                    }else{
                        pesoIdeal = (72.7*altura) - 45;
                    }
                }
            }
            if (sexo.equals("F")) {
                if (altura <= 1.50) {
                    if (idade >=35) {
                        pesoIdeal = (62.1*altura) - 45;
                    }else{
                        pesoIdeal = (62.1*altura) - 49;
                    }
                }else{
                        pesoIdeal = (62.1*altura)-44.7;  
                }
            }
            System.out.printf("Sexo : %s| Altura: %.2f | Idade: %d | Peso ideal: %.1f",sexo, altura, idade, pesoIdeal);  
        }
    }
}
