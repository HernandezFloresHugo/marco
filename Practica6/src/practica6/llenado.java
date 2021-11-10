
package practica6;

public class llenado {
    private int envases_llenados;
    private int lista_regulacion;
    
    public llenado(int envases_llenados, int lista_regulacion){
        this.envases_llenados=envases_llenados;
        this.lista_regulacion=lista_regulacion;
    }
    
    //metodo set
    public void setE(int envases_llenados){
        this.envases_llenados=envases_llenados;
    }
    public void setL(int lista_regulacion){
        this.lista_regulacion=lista_regulacion;
    }
    
    //metodo get 
    public int getE(){
        return this.envases_llenados;
    }
    public int getL(){
        return this.lista_regulacion;
    }
}
