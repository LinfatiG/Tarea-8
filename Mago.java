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

public class Mago {
    
    Scanner teclado = new Scanner(System.in);
  int meditaciones = 7;
  int mana = 4;
  String respuesta1 = "Si";
  String respuesta2 = "No";
  
  public void habilidad() {
    System.out.println("Le ha quitado un punto de vida al guardian.");
  }
  
  public void pi () {
    System.out.println("¿Desea utilizar la habilidad de su mago?");
    System.out.println("Escriba -Si- o -No-");
    String respuesta = teclado.nextLine();
    if (respuesta.equals(respuesta1)) {
      habilidad();
      mana = -1;
      System.out.println("Te quedan " + mana + " de mana.");
      
       if (mana == 0) {
        System.out.println("Usted ha agotado todos sus puntos de furia, por tanto no puede usar esta habilidad.");
      } 
      
    } else {
      System.out.println("Usted no ha usado su habilidad");
    }
      
  }
    
}
