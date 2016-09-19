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
    
/**
 * Constructor para la clase Pila, instancia la lista ligada que contiene esta clase
 */
 public Pila(){
     this.pila=new ListaLigada<T>();
 }  

 
 /**
  * Metodo que nos regresa la lista simplemente ligada que implementa esta clase Pila
  * @return 
  */
 public ListaLigada<T> getPila(){
    return pila;
 }
 
 
 /**
  * Metodo que inserta un elemento a la pila,en este caso lo inserta en la lista simplemente ligada al inicio
  * @param dato Dato el cual se va a insertar
  */
 public void push(T dato){
   pila.insertaInicio(dato);
 }
 
 /**
  * Metodo que saca el ultimo elemento insertado a la pila
  * @return valor del ultimo elemento de la pila
  */
 public T pop(){
    T dato=pila.getInicio().getDato();
    System.out.println(dato);
    pila.setInicio(pila.getInicio().getSiguiente());
    return dato;
 }
 
 /**
  * Metodo que nos muestra el ultimo elemento insertado a la pila sin sacarlo
  * @return valor del ultimo elemento de la pila
  */
 public T peek(){
    T dato=pila.getInicio().getDato();
    System.out.println(dato);
 
    return dato;
 }
 
 /**
  * Metodo que nos sirve para saber sin la pila se encuentra vacia o contiene elementos
  * @return regresa un dato booleano dependiendo si esta vacia(tru) o con elementos(false)
  */
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
