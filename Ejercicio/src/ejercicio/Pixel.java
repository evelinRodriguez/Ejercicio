
package ejercicio;


public class Pixel extends Ejercicio {
    int red;
    int green;
    int blue;
    
    
     void colocarColor(int a, int b, int c){
     
         
         red=a;
         green=b;
         blue=c;
        
     }
     void desaturar(){
         if(red>125){
             red=255;
             green=255;
             blue=255;
         }else{
             red=0;
             green=0;
             blue=0;
                    
         }
     }
     
                 
    
}
