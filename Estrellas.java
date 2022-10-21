import java.util.Scanner;
public class Estrellas{
    public static void main(String[] args){
        int e0=0;
        int e1=0;
        int e2=0;
        int e3=0;
        int e4=0;
        int e5=0;
        Scanner x = new Scanner(System.in);
        int i=x.nextInt();
        while(i>=0){
            switch(i){
             case 0:{
                e0++;
                break;
             }
             case 1:{
                e1++;
                break;
             }
             case 2:{
                e2++;
                break;
             }
             case 3:{
                e3++;
                break;
             }
             case 4:{
                e4++;
                break;
             }
             case 5:{
                e5++;
                break;
             }
            }
         i=x.nextInt();    
        }
        int t=e0+e1+e2+e3+e4+e5;
        System.out.println("0("+e0+") *("+e1+") **("+e2+") ***("+e3+") ****("+e4+") *****("+e5+")\nTotal: "+t);
    }
}