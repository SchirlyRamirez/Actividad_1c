import java.io.PrintStream;
import java.util.Scanner;

public class ejer_5 {

    public static PrintStream Screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
  
    public static void Ejer} (String[] args){
        double DOLAR = 4060;
        double EURO = 4309;
      
        Screen.println("Ingresa el valor en pesos");
        double pesos = keyboard.nextDouble();
      
        Screen.println("Pesos -> " + pesos);
        Screen.println("Dolares -> " + Math.round((pesos/DOLAR) * 100d) /100d);
        Screen.println("Euros -> " + Math.round((pesos/EURO) *100d) /100d);
