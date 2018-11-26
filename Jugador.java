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

public class Jugador {
    
    Scanner teclado = new Scanner(System.in);
  
  public void jugadores() {
    System.out.println("Â¿CuÃ¡ntas personas van a jugar?");
    int personas = val();
    if (personas > 0) {
      int vida[] = new int[personas];
      int posJugadores[] = new int [personas];
      String jugadores[] = new String[personas];

      for (int i = 0 ; i < personas ; i++) {
        System.out.println("Ingrese el nick del jugador " + (i + 1));
        jugadores[i] = teclado.nextLine();
        vida[i] = 15;
      }
      
    } else {
      jugadores();
    }
  } 
  
  public int val () {
    int num = 0;
    boolean error; 
     
    do {
        
      try {
        error = false;
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("El caracter ingresado no es numÃ©rico o se encuentra fuera del rango establecido, intÃ©ntelo nuevamente.");     
        error = true;
      }
      
    } while (error);
    
    return num;
  }
    
}
