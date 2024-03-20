public class Professor {
    public int nivel;
    public int horas;
    public double salarioFinal;

    public void calcSalarioProfessor(){
        nivel = Prompt.lerInteiro("Digite o nível do professor(1-2-3): ");
        horas = Prompt.lerInteiro("Quantas horas o professor trabalha? ");
        if (nivel == 1 || nivel == 2 || nivel == 3) {
            if (nivel == 1) {
                salarioFinal = horas * 12;
            }else if(nivel ==2){
                salarioFinal = horas * 17;
            }else{
                salarioFinal = horas * 25;
            }
            System.out.printf("O profesor ganha: R$ %.2f", salarioFinal);
        }else{
           System.out.println("Nível inválido!!"); 
        }
        
    }
}
