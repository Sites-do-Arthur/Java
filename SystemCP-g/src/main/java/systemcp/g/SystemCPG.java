/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package systemcp.g;

import java.util.Scanner;
import static javafx.application.Application.launch;
/**
 *
 * @author Win10
 */
public class SystemCPG {

    public static void main(String[] args) {
        //Área de declaração de variaveis
        Scanner teclado = new Scanner(System.in);
        String comando1;
        String comando2;
        String comando3;
        boolean seArquivos;
        //Fim da declaração de variaveis
        System.out.println("Iniciando CP-GUI SO");
        System.out.print("root> ");
        comando1 = teclado.nextLine();
        seArquivos = ("Arquivos".equals(comando1));
        
        if(seArquivos){
            launch("FileManagerControler.java");
        } 
    }
}

