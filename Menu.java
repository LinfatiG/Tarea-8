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

public class Menu {
    
    public void salirMenu() {
    System.out.println("Felicidades, preferiste ponerte a estudiar en vez de jugar, ahora si pasarÃ¡s todos tus ramos :)");    
    System.exit(0);
  }  
    
  public void menu(){ 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escoja la opciÃ³n a realizar:");
    System.out.println(); 
    System.out.println("1.- Mostrar instrucciones.");
    System.out.println("2.- Determinar cantidad de jugadores");
    System.out.println("3.- Generar tablero.");
    System.out.println("4.- Jugar");
    System.out.println("5.- Guardar el juego y ponerse a estudiar.");
    
    int opcn = val();
    seleccion(opcn);
  }  
    
  public void seleccion (int opcn) {
    Tablero tab = new Tablero();
    Guerrero g = new Guerrero();
    Mago m = new Mago();
    
    switch (opcn) {
      case 1: Instrucciones inst = new Instrucciones();
              inst.instrucciones();
              menu();
      break;
      
      case 2: Jugador jug = new Jugador();
              jug.jugadores();
              menu();
      break;
        
      case 3: tab.generarTablero();
              menu();
      break;
      
      case 4: g.pi();
              m.pi();
              tab.jugar();            
              menu();
      break;
        
      case 5: salirMenu();
      break;
        
      default: menu();
      break;
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
