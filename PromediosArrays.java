/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promediosarrays;
import java.util.Scanner;
/**
 *
 * @author Claudio
 */
public class PromediosArrays {
  
        
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese cantidad de numeros");
       
        int cantidad=teclado.nextInt();
        int [] numeros=new int[cantidad];
        int i; 
        
        for ( i=0;i<cantidad;i++){
        System.out.print("Ingrese numero "+(i+1)+":");
        numeros[i]=teclado.nextInt();
        }
          for (int r=0;r<numeros.length;r++){
            System.out.println("Nota ingresada para nota " + (r+1) + " es: " +numeros[r]);
        }
             p(numeros);
            }
        
          public static int p(int[]numeros){
               int s=0,p,x;
         for ( x = 0 ; x < numeros.length ; x++){
           s+=numeros[x];
           p = s / numeros.length;
          if (numeros.length==x)
              
             
              return  p = s / numeros.length;
         }
              p = s / numeros.length;
             System.out.println("Promedio de notas es :" + p);
                return  p = s / numeros.length;
          }
      
      
         
       }
        
        
  
        

        
    
     
    

    
     
     
     
     
         
            
         
        
        
    
    

    
    
    

