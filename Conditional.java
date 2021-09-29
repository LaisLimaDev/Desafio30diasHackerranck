import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/*4º desafio sobre condicionais, utilizei o laço if 
*/
public class Conditional {
	public static void main(String[] args) throws IOException {
        
        int  N=0; 

        Scanner scan = new Scanner(System.in);
        N=scan.nextInt();

        if(  N%2 ==1  || ( N > 5 &&  N < 21))

        	System.out.println("Weird");

        else

            System.out.println("Not Weird");

	}
}
	
