public class ProductoSimple{
    private int precio;
    
    public ProductoSimple(){
        this.precio=1000;
    }
    
    public ProductoSimple(int p){
        this.precio=p;
    }
    
    public int getPrecio(){
        return this.precio;
    }
}