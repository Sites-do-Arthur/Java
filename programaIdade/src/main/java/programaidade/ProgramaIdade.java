/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package programaidade;

import java.util.Scanner;

/**
 *
 * @author Win10
 * 
 * @version 1b
 */
public class ProgramaIdade {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Iniciando CP-GUI");
        System.out.print("Em que ano você naceu: ");
        int an = teclado.nextInt();
        System.out.print("Em que ano estamos? ");
        int a = teclado.nextInt();
        int idade = a - an;
        System.out.print("Sua idade é " + idade + ". E sua classificação é ");
        if (idade>= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
