Ejer_7

import java.io.PrintStream;
import java.util.Scanner;

public class Ejer_7 {
    public static PrintStream Screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);


    public static void main (String[] args){
        double lon = 0;
        double broad = 0;
        double height = 0;
        double liters = 0;

        screen.println("vamos a calcular el 90% de capacidad de un acuario, por favor ingrese el largo");
        lon = keyboard.nextDouble();
        screen,println("ingrese el ancho");
        broad = keyboard.nextDouble ();
        screen.println ("ingrese la altura");
        height = keyboard.nextDouble();
        liters = ((lon*broad*height)/1000)*0.9;

        screen.println("la capacidad del acuario al 90% es de:" + liters + "litros");
        
    }


}