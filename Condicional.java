import java.util.Scanner;
public class Condicional{
  public static void main(String[] args){
    Scanner unEscaner = new Scanner(System.in);
    int temp = unEscaner.nextInt();
    int dinero = unEscaner.nextInt();
    if (temp > 27){
      if (dinero > 5){
         System.out.println("helado");
      }
    }
    else {
      System.out.println("abrigo");  
    }
    System.out.println("fin");
 }
}