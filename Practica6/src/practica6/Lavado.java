package practica6;
public class Lavado {
    private float cLitros;
    private int tiempo;
    
    public Lavado(float cLitros, int tiempo){
        this.cLitros=cLitros;
        this.tiempo=tiempo;
    }
    
    //metodo set
    public void setcLitros(float cLitros){
        this.cLitros=cLitros;
    }
    public void setTiempo(int tiempo){
        this.tiempo=tiempo;
    }
    //metodo get
    
    public float getcLitros(){
        return this.cLitros;
    }
    public int getTiempo(){
        return this.tiempo;
    }
}
