package arboles;

/**
 *
 * @author Jonathan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombre = {"F","B", "A", "D", "C", "E", "G", "I", "H"};
        Ordenamientos arbolCreado = new Ordenamientos();
        
        for (String nomb : nombre) {
            arbolCreado.agregarNodo(nomb);
        }
        
        System.out.println("ORDENAMIENTO InOrden:");
        arbolCreado.inOrden(arbolCreado.raiz);
        
        System.out.println("\n\nORDENAMIENTO PostOrden:");
        arbolCreado.postOrden(arbolCreado.raiz);
        
        System.out.println("\n\nORDENAMIENTO PreOrden:");
        arbolCreado.preOrden(arbolCreado.raiz);
    }
    
}
