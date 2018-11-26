/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg8;

/**
 *
 * @author gilio
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Guerrero {
    
     Scanner teclado = new Scanner(System.in);
  int saludMaxima = 20;
  int furia = 5;
  String respuesta1 = "Si";
  String respuesta2 = "No";
  
  public void habilidad() {
    System.out.println("Escoja al jugador en el cual utilizará la habilidad.");
    System.out.println("El jugador escogido ha perdido 1 punto de vida.");
  }
  
  public void pi () {
    System.out.println("¿Desea utilizar la habilidad de su guerrero?");
    System.out.println("Escriba -Si- o -No-");
    String respuesta = teclado.nextLine();
    if (respuesta.equals(respuesta1)) {
      habilidad();
      furia = -1;
      System.out.println("Te quedan " + furia + " de furia.");
      
      if (furia == 0) {
        System.out.println("Usted ha agotado todos sus puntos de furia, por tanto no puede usar esta habilidad.");
      } 
      
    } else {
      System.out.println("Usted no ha usado su habilidad");
    }
      
  }
    
}
