import java.util.Scanner;

public class Multiplos5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        for(int i = 1; i <= num; i++){
            
            if(i%5 == 0){
                System.out.println(i);
            }
            
            
        }
    }
}
