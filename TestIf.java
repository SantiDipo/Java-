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
public class TestIf {
    
public static void main (String[] args){
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el primer numero");
    int num1 = leer.nextInt();
    System.out.println("Ingrese el segundo numero");
    int num2 = leer.nextInt();
    if (num1 > 25 || num2 > 25){
        System.out.println("Uno de los dos numero, o ambos, es mayor a 25");
    }else{
        System.out.println("Ninguno de los valores supera 25");
          
    }
    }
}

