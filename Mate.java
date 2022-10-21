public class Mate{
    public int factorial(int numero){
        int elFactorialDelNumero = 1;
        for(int i = 1; i <= numero; i = i + 1){
          elFactorialDelNumero = elFactorialDelNumero * i;
        }
        return elFactorialDelNumero;
    }
}
