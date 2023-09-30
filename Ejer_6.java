Ejer_6

import java.io.PrintStream;
import java.util.Scanner;

public class Ejer_6 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner (System.in);
    
    public static void main (String[] args){
        int segundos = 0;
        int dia = 0;
        int hora = 0; 
        int minutos = 0; 
        int segundos2 = 0;

        screen.println("ingrese los segundos:");
        segundos = keyboard.nextInt();
        dia = segundos/86400;
        hora = ((segundos%86400)/60)/60;
        minutos = (((segundos%86400)%3600)/60);
        segundos2 =((segundos%86400)%3600)%60;

        screen.println("los dias son:"+ dia + "- las horas son:" + hora + "- los minutos son:" + segundos + 
        "- los segundos son:" + segundos2 +)





    }


}