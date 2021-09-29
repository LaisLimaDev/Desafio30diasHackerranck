import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // valor original da refeição
        int tipPercent = scan.nextInt(); // porcentagem da gorjeta
        int taxPercent = scan.nextInt(); // porcentagem de impostos
        scan.close();
      
        double tip = (mealCost * tipPercent )/ 100;
        double tax = (mealCost * taxPercent) / 100;
        double total = mealCost + tip + tax;
      
        int totalCost = (int) Math.round(total);
      
        System.out.println( totalCost);
    }
}
