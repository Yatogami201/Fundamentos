import java.util.Scanner;
class ContIncrDecr{
    public static void main(String[] args){
        Scanner escaner = new Scanner(System.in);
        double valorAnterior = 0.0;
        double valor = 0.0;
        int contador = 0;
        valor = escaner.nextInt();
        while (valor != 0){ // hasta valor == 0
           if (valor >= valorAnterior){
               contador = contador+1;
               System.out.println("+1");
           } 
           else{ // valor < valorAnterior
               contador = contador-1;
               System.out.println("-1");
           }
           valorAnterior = valor;  
           valor = escaner.nextInt();
        }
        System.out.println("Contador: "+contador);
    }
}