public class ContadorSimple {
    private int conteo;
    
    public ContadorSimple(){
        this.conteo = 1;
    }
    
    public void aumentar(){
        this.conteo += 1;
    }
    
    public void disminuir(){
        this.conteo -= 1;
    }
    
    public int getConteo(){
        return this.conteo;
    }
}