/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package medias;

import java.util.Scanner;
        
/**
 *
 * @author Win10
 */
public class Medias {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1;
        float n2;
        float media;
        System.out.println("Iniciando CP-GUI");
        System.out.print("Digite a primeira nota do aluno: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite a segunda media do aluno: ");
        n2 = teclado.nextFloat();
        media = (n1 + n2)/2;
        System.out.println("Sua media foi " + media);
        if(media > 9) {9
            System.out.println("Parabéns pela sua nota!!");
        }
    }
}
