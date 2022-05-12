/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner; 
/**
 *
 * @author Santiago D'Ippolito
 */
public class TestWhile {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("INGRESE UNA NOTA");
        int nota= leer.nextInt();
        
        while(nota<10){
            System.out.println("Su nota no esta en el rango adecuado, vuelva a ingresar un valor");
            nota = leer.nextInt();
            
    }
        System.out.println("Su nota se encuentra entre 0 y 10 ");
}
}