public class MascotaSimple {
    private int edad;
    private String nombre;
    
    public MascotaSimple(){
        this.edad = 8;
        this.nombre = "Kitty";
    }
    
    public MascotaSimple(String n){
        this.nombre = n;
        this.edad = 8;
    }
    
    public MascotaSimple(String n, int e){
        this.nombre = n;
        this.edad = e;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}