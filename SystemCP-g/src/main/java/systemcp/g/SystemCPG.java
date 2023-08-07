/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package systemcp.g;

import static javafx.application.Application.launch;
import java.util.Scanner;
/**
 *
 * @author Win10
 */
public class SystemCPG {

    public static void main(String[] args) {
        //Área de declaração de variaveis
        Scanner teclado = new Scanner(System.in);
        String comando1;
        comando1 = null;
        String comando2 = null;
        String comando3 = null;
        boolean seArquivos;
        boolean seCalc;
        boolean flavio;
        //Fim da declaração de variaveis
        System.out.println("Iniciando CP-GUI SO");
        System.out.print("root> ");
        comando1 = teclado.nextLine();
        seArquivos = ("Arquivos".equals(comando1));
        seCalc = ("Calculadora".equals(comando1));
        if(seArquivos){
            launch("FileManager.fxml");
        }
        if(seCalc) {
            launch("CalculadoraInterativa.fxml");
        }
        System.out.print("root> ");
        comando2 = teclado.nextLine();
        flavio = ("flavio --console".equals(comando2));
        if(flavio) {
            byte menu;
            System.out.println("Iniciando Flávio");
            System.out.println("Digite [1] para calcular raiz quadrada");
            System.out.println("Digite [2] para calcular elevação");
            System.out.println("Digite [3] para sair");
            menu = teclado.nextByte();
        }
    }

}

