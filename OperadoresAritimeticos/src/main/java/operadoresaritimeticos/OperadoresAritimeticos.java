/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package operadoresaritimeticos;
import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class OperadoresAritimeticos {

    public static void main(String[] args) {
        System.out.println("Iniciando Flávio");
        Scanner teclado = new Scanner(System.in);
        /*System.out.print("Digite um valor: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite o segundo valor: ");
        int n2 = teclado.nextInt();
        float m = (n1 + n2)/2;
        System.out.printf("A média é igual a " + m);
        System.out.print("Digite um numero: ");
        int numero = teclado.nextInt();
        int valor = teclado.nextInt() + numero--;
        System.out.println(valor);*/
        /*int x = 4;
        x *= 2;
        System.out.println(x);*/
        /*float x = (float) 8.9;
        int ar = (int) Math.round(x);
        System.out.println(ar);*/
        
        double ale = Math.random();
        int n = (int) (5 + ale * (10-5));
        System.out.println(n);
    }

    
    
}
