import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class WeirdOrNot {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if(N%2 == 0)
        {
            if(N>=2 && N<=5)
            {
                System.out.println("Not Weird");
            }
            else if(N>=6 && N<=20)
            {
                System.out.println("Weird");
            }
            else
            {
                System.out.println("Not Weird");
            } 
        }
        else
        {
            System.out.println("Weird");
        }

        }
}


/*Dia 6 do desafio do Hackerranck
 Tarefa
Dado um número inteiro, execute as seguintes ações condicionais:
Se n é estranho, imprima Weird
Se n é par e na faixa inclusiva de 2 para 5, imprimir Not Weird
Se n é par e na faixa inclusiva de 6 para 20, imprimirWeird
Se n é par e maior que 20, imprimirNot Weird
*/