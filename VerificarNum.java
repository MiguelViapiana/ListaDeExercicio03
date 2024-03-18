public class VerificarNum {
    public double[] num = new double[80];
    public double[] numIntervalo = new double[80];
    public int i, p;

    public void inserirNums(double[] n){
        for(i =0; i <80; i++){
            System.out.printf("Digite o %d° número: ", (i+1));
            n[i] = Prompt.lerDecimal();
        }
        p =0;
        for(i =0; i <80; i++){
            if (n[i] <= 10 || n[i] >= 150) {
                
            }else{
                numIntervalo[p] = n[i];
                p++;
            }
        }
        System.out.println("Os números que estão no intervalo entre 10 e 150 são: ");
        for(i =0; i < p; i++){
            System.out.print(numIntervalo[i]+" " );
        }
    }
}
