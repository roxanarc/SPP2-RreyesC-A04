/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rreyesc.a04;
import java.util.Scanner;
/**
 *
 * @author Aldape
 */
public class SPP2RreyesCA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Variables
        Scanner teclado= new Scanner (System.in);
        int opEntrada;
        double ang, r;
        
        //Desplegar menu
        System.out.println("Actividad 4, Operaciones trigonometricas");
        System.out.println(" ");
        System.out.println("Menu: ");
        System.out.println("1. Calcular tangente");
        System.out.println("2. Calcular seno");
        System.out.println("3. Calcular conseno");
        System.out.println("4. Salir");
        System.out.println(" ");
        System.out.println("Seleccione la opcion que desee usar");
        //Elegir opción
       opEntrada = teclado.nextInt();
       
       //Acciones 
       switch (opEntrada){
           case 1:
               System.out.println("Cálculo de Tangente");
               System.out.println("Introduce el ángulo:");
               ang= teclado.nextDouble();
               r= Math.tan((ang*Math.PI)/180);
               System.out.println("La tangente de "+ ang +"es = "+r);
               break;
           case 2:
               System.out.println("Cálculo de Seno");
               System.out.println("Introduce el ángulo:");
               ang= teclado.nextDouble();
               r= Math.sin((ang*Math.PI)/180);
               System.out.println("El seno de "+ ang +"es = "+r);
               break;
           case 3:
               System.out.println("Cálculo de Coseno");
               System.out.println("Introduce el ángulo:");
               ang= teclado.nextDouble();
               r= Math.cos((ang*Math.PI)/180);
               System.out.println("El Coseno de "+ ang + "es = "+r);
               break;
           default:
               System.out.println("Adios! :)");
       
    }
    
}
}