/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.Scanner;
        
public class TestDatosEntrada {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese si la bandera es verdadero o falso");
        boolean bandera = leer.nextBoolean();
        System.out.println("Ingrese un numero");
        double numero = leer.nextDouble(); 
        System.out.println("Ingrese un numero que tendra como resultado un caracter");
        char letra; 
        letra = (char) leer.nextInt();
        System.out.println(letra);
    }
}
