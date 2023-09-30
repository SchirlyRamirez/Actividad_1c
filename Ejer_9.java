Ejer_9
import java.io.PrintStream;
import java.util.Scanner;

public class Ejer_9 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner (System.in);

    public static void main (String[] args){

        long time = 0;
        long distance = 0;
        long speed = 0;
        
        screen.println("ingrese tiempo de recorrido:");
        time = keyboard.nextLong();
        Screen.println ("ingrese la distancia en kilometros recorrida:");
        distance = keyboard.nextLong();
        speed = distance/time;
        screen.println("velocidad necesaria para recorrer x kilometros en x tiempo:" + speed + "Km/H");
    }




}