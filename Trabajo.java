import java.util.Scanner;
public class Trabajo{
    public static void main(String[] args){
        Scanner unEscaner = new Scanner(System.in);
        int dia = unEscaner.nextInt();
        double salario = unEscaner.nextDouble();
        switch(dia){
            case 1 : 
                salario = salario*1.455;
                break;
            case 4 : 
                salario = salario*1.1;
                break;
            case 5 :
                salario = salario*1.295;
                break;
            case 6 :
                salario = salario*1.75;
                break;
            case 7:
                salario = salario*1.75;
                break;
        }
        String salarioConDosDecimales = String.format("%.2f",salario);
        System.out.println(salarioConDosDecimales);
    }
}
