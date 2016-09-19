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
     * Metodo main que nos sirve para probar la funcionalidad de nuestras clases Pila y Cola que se implementan 
     * con una lista simplemente ligada.
     * @param args argumentos desde la linea de comandos,los parametros del metodo se le pasan a travez de los argumentos, son 
     * un array de archivos de texto con diferentes pruebas para cada clase.
     */
    public static void main(String[] args)throws FileNotFoundException,IOException {
      for(int i=0;i<args.length;i++){//For que nos sirve para recorrer el array de los parametros desde la linea de comandos
         System.out.println(args[i]);
         File file=new File(args[i]);  
         FileReader archivo =new FileReader(file);
         BufferedReader input=new BufferedReader(archivo);
         String entrada="";
         //La primer linea del archivo,este entero nos define la estructura que vamos probar una pila(0) o una cola(1)
         Integer tamaño=Integer.parseInt(input.readLine());
         //si el tamaño es = 0 creara una nueva pila
      if(tamaño==0){
        Pila<Integer> miPila=new Pila<Integer>();
        //Las demas lineas son numeros,cada uno corresponde a una operacion
         while((entrada=input.readLine())!=null){//While que recorre las demas lineas del archivo
            //Si es un numero 0 realizara la operacion  push dentro de la pila insertando el numero siguiente al 0
            if(entrada.startsWith("0")){ 
               String aux=entrada.substring(1,entrada.length());
               Integer dato=Integer.parseInt(aux);
               miPila.push(dato);
            }else{
            //si es un numero 1 realizara la operecion pop dentro de la pila
               if(entrada.startsWith("1")){
                  miPila.pop();
            }else{
            //si es un numero 2 realizara la operacion peek dentro de la pila
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
            while((entrada=input.readLine())!=null){//While que recorre las demas lineas del archivo
            //si es un numero 0 realizara la operacion insertar dentro de la Cola e insertara el numero que le sigue al 0
                if(entrada.startsWith("0")){
                 String aux2=entrada.substring(1,entrada.length());
                 Integer nuevo=Integer.parseInt(aux2);
                 colona.insertar(nuevo);
             }else{
            //si es un numero 1 realizara la operacion eliminar dentro de la Cola       
               if(entrada.startsWith("1")){
                  colona.eliminar();
               }
             }
           }
         }
       }
          System.out.println("------------------------------");//estas lineas delimitan cada ejecucion con los diferentes archivos
     } 
        
   }
}
    

