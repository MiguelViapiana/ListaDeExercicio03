public class VerificarNum {
    public double[] num = new double[80];
    public double[] numIntervalo = new double[80];
    public int i, p;

    public void analisarNums(){
        p =0;
        for(i =0; i <80; i++){
            if (num[i] <= 10 || num[i] >= 150) {
                
            }else{
                numIntervalo[p] = num[i];
                p++;
            }
        }
    }
}
