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
  
    public ListaLigada<T> getCola(){
         return cola;
    }
   
    public void insertar(T dato){
     
     if(cola.getInicio()!=null){
         cola.insertaFinal(dato);
     }else{
         cola.insertaInicio(dato);
     }
    
    }
    
    public T eliminar(){
    Nodo<T> temporal=cola.getInicio();
    cola.setInicio(temporal.getSiguiente());
        System.out.println("Dato eliminado: "+temporal.getDato());
    return temporal.getDato();
    }
}
