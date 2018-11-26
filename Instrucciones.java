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
public class Instrucciones {
    
    public void instrucciones() {
    System.out.println("Instrucciones:");
    System.out.println();
    System.out.println("1.- Cada jugador tendrÃ¡ 15 puntos de vida(HP) al inicio del juego.");
    System.out.println("2.- Se pueden perder y recuperar los puntos de vida, sin sobrepasar el lÃ­mite de 15.");
    System.out.println("3.- Cada jugador lanzarÃ¡ al inicio de cada turno 2 dados de 6 caras, avanzando la cantidad de casillas correspondiente a la suma de los 2 dados.");
    System.out.println("    TambiÃ©n se le darÃ¡ al jugador la opciÃ³n de meditar, teniendo la posibilidad de usarla 5 veces, lo que le permitirÃ¡ moverse en un radio de 3 casillas.");
    System.out.println("4.- Se puede ganar el juego de 2 formas distintas.");
    System.out.println("      a) Llegar a la casilla final en primer lugar, ocupÃ¡ndose los lugares correspondientes segÃºn la cantidad de vida con la que quedase cada jugador.");
    System.out.println("      b) Ser el Ãºltimo jugador en pie, es decir, ser el Ãºnico jugador con puntos de vida, ocupÃ¡ndose los lugares correspondientes segÃºn el orden en el cual perdieron todos sus HP.");
    System.out.println("5.- Hay 6 tipos de casillas distintas, que son:");
    System.out.println("      a) Casilla de partida(1) --> Donde todos los jugadores se encuentran inicialmente.");
    System.out.println("                                   Volver a caer en esta casilla luego de iniciada la partida, restaura automÃ¡ticamente los puntos de vida.");
    System.out.println("      b) Casilla en blanco(2)  --> Al caer en esta casilla se termina el turno actual y se pasa al siguiente."); 
    System.out.println("      c) Casilla portal(3)     --> Caer en esta casilla teletransporta al jugador a otro portal escogido aleatoriamente.");
    System.out.println("      d) Casilla de salud(4)   --> Caer en esta casilla aumente o reduce los puntos de vida en 1 Ã³ 3 de forma aleatoria.");
    System.out.println("      e) Casilla desafÃ­o(5)    --> Se escoge un desafÃ­o aleatorio, consistente en avanzar/retroceder (de 1 a 5 casillas) o agregar/quitar (de 1 a 4  puntos de vida) a los demÃ¡s jugadores, todo de forma aleatoria.");
    System.out.println("      f) Casilla final(6)      --> El primer jugador en caer en esta casilla se convierte en el ganador, acabÃ¡ndose el juego en ese momento.");
    System.out.println("6.- Cada jugador ha de ir llevando la cuenta de su posiciÃ³n actual en el tablero.");
    System.out.println();
  }
    
}
