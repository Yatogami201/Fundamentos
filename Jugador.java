public class Jugador{
    // atributos
    private String nombre;
    private int salud;
    
    // metodos
    public String getNombre(){
        return nombre;
    }
    public int getSalud(){
        return salud;
    }
    public void reducirSalud(int reduccion){
        this.salud = this.salud - reduccion;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSalud(int salud){
        this.salud = salud;
    }   
   }
   