/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t03_pilasycolas;

/**
 *
 * @author Jairo
 */
public class Cola<T> {
    
    private ListaLigada<T> cola=new ListaLigada();
  
    /**
     * Metodo que nos sirve para obtener la lista ligada que implementa la cola
     * @return Lista simplemente ligada donde se almacenan los elementos que ingresan a la cola
     */
    public ListaLigada<T> getCola(){
         return cola;
    }
    
    /**
     * Metodo que inserta un elemento a la Cola
     * @param dato valor del elemento que se va a insertar
     */
    public void insertar(T dato){
     
     if(cola.getInicio()!=null){
         cola.insertaFinal(dato);
     }else{
         cola.insertaInicio(dato);
     }
    
    }
    
    /**
     * Metodo que saca el primer elemento de la cola 
     * @return regresa el primer elemento insertado en la cola 
     */
    public T eliminar(){
    Nodo<T> temporal=cola.getInicio();
    cola.setInicio(temporal.getSiguiente());
        System.out.println(temporal.getDato());
    return temporal.getDato();
    }
}
