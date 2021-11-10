package practica6;
public class Empaque extends Maquinas{
    private String tipo_empaque;
    private int cantidad_empaques;
    
    public Empaque(String descripcion, String fecha, float costo,String tipo_empaque, int cantidad_empaques){
        super(descripcion,fecha,costo);
        this.tipo_empaque=tipo_empaque;
        this.cantidad_empaques=cantidad_empaques;
    }
    
    //metodo set
    public void setT(String tipo_empaque){
        this.tipo_empaque=tipo_empaque;
    }
    public void setC(int cantidad_empaques){
        this.cantidad_empaques=cantidad_empaques;
    }
    
    //metodo get
    public String getT(){
        return this.tipo_empaque;
    }
    public int getL(){
        return this.cantidad_empaques;
    }
    
}
