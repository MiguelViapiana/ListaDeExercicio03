public class CursoCienciaComputacao {
    public double lab;
    public double avsem;
    public double examfinal;
    public double media;

    public void calcMediaPonderada(){
        lab = Prompt.lerDecimal("Digite a nota do Laborátorio: ");
        avsem = Prompt.lerDecimal("Digite a nota da Avaliação Semestral: ");
        examfinal = Prompt.lerDecimal("Digite a nota do Exame Final: ");
        if (lab < 0 || lab >10 || avsem < 0 || avsem >10 || examfinal < 0 || examfinal >10) {
            System.out.println("Nota inválida!!");
        }else{
           media = ((lab * 2) +(avsem * 3)+ (examfinal* 5))/10; 
           System.out.printf("A média das notas foi de: %.1f", media); 
        }
        
    }

}
