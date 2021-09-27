import java.util.Scanner;


public class HelloWorld {

public static void main (String[] args) {
Scanner hello = new Scanner (System.in);
String inputString = hello.nextLine (); 

System.out.println ("Hello, World.");

System.out.println (inputString);

hello.close();

	}
}