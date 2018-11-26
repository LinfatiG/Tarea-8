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

public class Tablero {
    
    
     Scanner teclado = new Scanner(System.in);
     int blanco = 2;
     int portal = 3;
  
     int desafio = 5;
     int f = 6;
  
  public void generarTablero() {
    System.out.println("Â¿De cuÃ¡ntas casillas desea generar el tablero?");
    int casillas = val();
    
    if (20 <= casillas) {
      int tab[] = new int[casillas];
      
      for (int i = 1 ; i < tab.length -1 ; i++ ) {
        tab[0] = 1;
        tab[tab.length - 1] = 6;
        tab[i] = (int) (Math.random() * 4) + 2;
      }    
      
      for (int i : tab) {
        System.out.print(" | " + i + " | ");
      }
      
      System.out.println();
    } else {
      System.out.println("El tablero debe de tener al menos 20 casillas, ingrese el valor correcto.");
      generarTablero();
    }
    
  }
  
  public void desafio(int indiceJugador , int casilla[] , int posJugadores[]) {
    int azar = (int) (Math.random() * 2) + 1;
    
    if (azar == 1) {
      int azar2 = (int) (Math.random() * 2) + 1;
      
      if (azar2 == 1) {
        posJugadores[indiceJugador] = 5;
        int cas1 = (int) (Math.random() * 5) + 1;
        System.out.println("Usted tendrÃ¡ que avanzar " + cas1 + " casillas");
      }else {
        posJugadores[indiceJugador] = 5;
        int cas2 = (int) (Math.random() * 5) + 1;
        System.out.println("Usted tendrÃ¡ que retroceder " + cas2 + " casillas");
      } 
      
    } else {
      int azar3 = (int) (Math.random() * 2) + 1;
      
      if (azar3 == 1) {
        posJugadores[indiceJugador] = 5;
        int ph1 = (int) (Math.random() * 4) + 1;
        System.out.println("Usted ha ganado " + ph1 + " puntos de vida");
      } else {
        posJugadores[indiceJugador] = 5;
        int ph2 = (int) (Math.random() * 4) + 1;
        System.out.println("Usted ha perdido " + ph2 + " puntos de vida");
      }   
      
    }
    
  }
  
  public void portal(int indiceJugador , int tablero[] , int posJugador[]) {
    posJugador[indiceJugador] = 3;  
    System.out.println("Te moverÃ¡s a otra casilla portal");
  }
  
  public void salud(int indiceJugador , int vida[]) {
    int num = (int) (Math.random() * 2) + 1;
    int vidaRandom = (int) (Math.random() * 3 + 1);
    
    if (num == 1){
      vida[indiceJugador] += vidaRandom; 
      System.out.println("Usted ha ganado " + vidaRandom + " de vida");
      
    } else {
      int num2 = (int) (Math.random() * 3) + 1;
      vida[indiceJugador] -= vidaRandom;
      System.out.println("Usted ha perdido " + vidaRandom + "de vida");
    }
  }
  
  public void jugar() {
    int meditar = 5;
    System.out.println("Â¿QuÃ© desea hacer?");
    System.out.println("1.- Lanzar dados");
    System.out.println("2.- Meditar");
    int op = val();
    
    if (op == 1) {
      int dado1 = (int)(Math.random() * 6 + 1);
      System.out.println("Dado 1 = " + dado1);
      int dado2 = (int)(Math.random() * 6 + 1);
      System.out.println("Dado 2 = " + dado2);
      int dados = dado1 + dado2;
      System.out.println("La suma de los dados es " + dados);
      System.out.println();
    } else {
      System.out.println("Puedes moverte 3 casillas en cualquier direcciÃ³n desde tu posiciÃ³n actual");
      System.out.println("Ha recuperado 1 punto de vida");
      int med = meditar - 1;
      int cont = med;
      if (cont == 0) {
        System.out.println("Agotaste todas tus posibilidades de meditar");
        jugar();
       }
       
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
