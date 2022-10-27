import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String entrada = scan.nextLine();
    String a = entrada.replaceAll("Quiere Cacao","");
    System.out.println(a);
    
      
    
  }
}