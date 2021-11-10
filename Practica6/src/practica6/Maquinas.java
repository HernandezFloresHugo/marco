package practica6;
public class Maquinas {
    protected String descripcion;
    protected String fecha;
    protected float costo;
    
    public Maquinas(String descripcion, String fecha, float costo){
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.costo=costo;
    }
    //metodo set
    public void setDesc(String descripcion){
        this.descripcion=descripcion;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    public void setCost(float costo){
        this.costo=costo;
    }
    //metodo get
    public String getDesc(){
        return this.descripcion;
    }
    public String getFecha(){
        return this.fecha;
    }
    public float getCost(){
        return this.costo;
    }
    
}
