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
public class Pila <T> {
    private ListaLigada<T> pila;
    
 public Pila(){
     this.pila=new ListaLigada<T>();
 }   
 
 public ListaLigada<T> getPila(){
    return pila;
 }
 
 public void push(T dato){
   pila.insertaInicio(dato);
 }
 public T pop(){
    T dato=pila.getInicio().getDato();
    System.out.println(dato);
    pila.setInicio(pila.getInicio().getSiguiente());
    return dato;
 }
 
 public T peek(){
    T dato=pila.getInicio().getDato();
    System.out.println(dato);
 
    return dato;
 }
 
 public boolean isEmpty(){
    Nodo<T> tope=pila.getInicio();
     if(tope==null){
         System.out.println("La pila esta vacia");
        return true;
    }else{
        System.out.println("La pila contiene elementos");
        return false;
    
    }
 
 
 }
 
}
