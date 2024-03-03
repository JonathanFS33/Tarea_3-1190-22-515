package arboles;

/**
 *
 * @author Jonathan
 */
public class Ordenamientos {
    Nodos raiz; //crea el nodo raiz del arbol
    
    public Ordenamientos(){
        raiz = null;
    }
    
    public boolean arbolVacio(){
        return raiz == null;
    }
    
    public void agregarNodo(String nombre){
        Nodos nuevo = new Nodos(nombre);
        if(raiz == null){
            raiz = nuevo;
        } else {
            Nodos auxiliar = raiz;
            Nodos padre;
            while(true){
                padre = auxiliar;
                if(nombre.compareTo(auxiliar.nombre)<=0){
                    auxiliar = auxiliar.hijoIzquierdo;
                    if(auxiliar == null){
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                } else{
                    auxiliar = auxiliar.hijoDerecho;
                    if(auxiliar == null){
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    public void inOrden(Nodos r){
        if(r!=null){
            inOrden(r.hijoIzquierdo);
            
            System.out.print(r.nombre + ", ");
            
            inOrden(r.hijoDerecho);
        }
    }
    
    public void postOrden(Nodos r){
        if(r!=null){
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho);
            
            System.out.print(r.nombre + ", ");
        }
    }
    
    public void preOrden(Nodos r){
        if(r!=null){
            System.out.print(r.nombre + ", ");
            
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);
        }
    }
}
