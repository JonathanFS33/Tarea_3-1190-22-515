package arboles;

/**
 *
 * @author Jonathan
 */
public class Nodos {
    
    String nombre;
    Nodos hijoIzquierdo, hijoDerecho;
    
    public Nodos(String nombre){
        this.nombre = nombre;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
    
}
