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
public class ListaLigada<T>{
    
  private Nodo<T> inicio;
  
  public Nodo<T> getInicio(){
      return inicio; 
  }
  public void setInicio(Nodo<T> inicio){
      this.inicio=inicio; 
  }
  
  public void recorrer_r(Nodo<T> aux){
      if(aux!=null){
        System.out.println(aux.getDato());
        recorrer_r(aux.getSiguiente());
      }
  }
  
  
  
  /**
   * Este metodo inserta un nuevo Nodo al inicio de la lista
   * @param dato Es el valor que se va a almacenar en el nuevo nodo.
   */
  public void insertaInicio(T dato){
    Nodo<T> nuevo=new Nodo<T>(dato);
    nuevo.setSiguiente(inicio);
    inicio=nuevo;
  
  }
  

  
  
 /**
  * Este metodo inserta un nuevo Nodo al final de la lista
  * @param dato Es el valor que se va almacenar en el Nodo que se va a insertar.
  */ 
  public void insertaFinal(T dato){
     Nodo<T> nuevo=new Nodo<T>(dato);
     Nodo<T> temporal=inicio;
     while(temporal.getSiguiente()!=null){
         temporal=temporal.getSiguiente();
     }
     temporal.setSiguiente(nuevo);
  }
  
  
  
  
  
  /**
   * Este metodo inserta un elemento a la lista antes de una referencia dada
   * @param referencia Es la referencia antes de la cual se va a insertar el nuevo elemento.
   * @param dato Es el nuevo dato que se va a insertar
   */
  public void insertaAntesDe(T referencia,T dato){
      Nodo<T> nuevo=new Nodo<T>(dato);
      Nodo<T> temporal=inicio;
      Nodo<T> aux=inicio;
      while(temporal.getSiguiente()!=null){
          if(temporal==inicio && temporal.getDato()== referencia){
             this.insertaInicio(dato);
          }
          temporal=temporal.getSiguiente();
          if(temporal.getDato()== referencia){
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(temporal);
                
          }else{
            aux=temporal;
          }
      }
  }
  
  
  
  public String toString(){
     String s="";
     Nodo<T> temporal=inicio;
     while(temporal!=null){
         s+=(temporal.getDato()+" --->");
         temporal=temporal.getSiguiente();
     }
     return s;
  }
}
