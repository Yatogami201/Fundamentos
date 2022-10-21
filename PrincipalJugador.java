import java.util.Scanner;
public class PrincipalJugador{
    public static void main(String[] args){
        Jugador jugador1 = new Jugador();
        Scanner entrada = new Scanner(System.in);
        int salud = entrada.nextInt();        
        String nombre = entrada.next();
        jugador1.setNombre(nombre);
        jugador1.setSalud(salud);
        int reduccion = entrada.nextInt();
        jugador1.reducirSalud(reduccion);
        int reduccion2 = entrada.nextInt();
        jugador1.reducirSalud(reduccion2);
        System.out.println(jugador1.getNombre()+jugador1.getSalud());
    }
}

