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
import java.io.*;

public class Ee_t03_pilasycolas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException,IOException {
       File file=new File("datos.txt");  
        FileReader archivo =new FileReader(file);
        BufferedReader input=new BufferedReader(archivo);
        String entrada="";
        Integer tamaño=Integer.parseInt(input.readLine());//Este entero nos dice si vamos a probar una pila(0) o una cola(1)
        
        //si el tamaño es = 0 creara una nueva pila
        if(tamaño==0){
        Pila<Integer> miPila=new Pila<Integer>();
         while((entrada=input.readLine())!=null){//While que recorre las demas instrucciones del archivo
            if(entrada.startsWith("0")){ 
             String aux=entrada.substring(1,entrada.length());
             Integer dato=Integer.parseInt(aux);
             miPila.push(dato);
           }else{
             if(entrada.startsWith("1")){
               miPila.pop();
             }else{
               if(entrada.startsWith("2")){
               miPila.peek();
               }
             }
            }
            
         }
            
        
        }else{
         //Ahotra bien si el tamaño es = 1 creara una nueva Cola y probara las intrucciones con esta estructura   
         if(tamaño==1){   
         Cola<Integer> colona=new Cola<Integer>();
         while((entrada=input.readLine())!=null){
             if(entrada.startsWith("0")){
              String aux2=entrada.substring(1,entrada.length());
              Integer nuevo=Integer.parseInt(aux2);
              colona.insertar(nuevo);
             }else{
               if(entrada.startsWith("1")){
                 colona.eliminar();
               }
             }
         }
         
         }
        }
        
        
    }
}
    

