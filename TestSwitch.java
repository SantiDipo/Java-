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
public class TestSwitch {
    public static void main (String[] args){
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese que tipo de bomba desea");
        System.out.println("1-Bomba de agua");
        System.out.println("2-Bomba de gasolina");
        System.out.println("3-Bomba de Hormigon");
        System.out.println("4-Bomba de pasta alimenticia");
      int tipoMotor = leer.nextInt();
      switch (tipoMotor){
          case 1:
              System.out.println("Usted eligio la bomba de agua");
              break;
          case 2:
              System.out.println("Usted eligio la bomba de gasolina");
              break;
          case 3:
              System.out.println("Usted eligio la bomba de hormigon");
              break;
          case 4:
              System.out.println("Usted eligio la bomba de pasta alimenticia");
              break;
          default:
              System.out.println("Este valor no corresponde a ninguna bomba");
      }
    }

}
