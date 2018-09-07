
package ejercicio;


public class Ejercicio {

    
    public static void main(String[] args) {
      int a,b,c;
      
      Pixel imagen[][];
      imagen=new Pixel[1024][600];
      
       for(int i=0;i<1024;i++){
            for (int j=0;j<600;j++){
                imagen[i][j]=new Pixel();
                a=(int)(Math.random()*255)+1;
                b=(int)(Math.random()*255)+1;
                c=(int)(Math.random()*255)+1;
                 imagen[i][j].colocarColor(a, b, c);
             }
          }
   
       
       
        for(int i=0;i<1024;i++){
            for (int j=0;j<600;j++){
                imagen[i][j]=new Pixel();
                imagen[i][j].desaturar();
             }
          }
}
}
