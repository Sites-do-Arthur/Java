/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package systemcp.g;

import java.io.IOException;
import java.util.Scanner;
import systemcp.g.sql.java.App;
import systemcp.g.sql.java.Flavio;

/**
 *
 * @author Win10
 */
public class SystemCPG {

    public static void main(String[] args) throws IOException {
        //Área de declaração de variaveis
        Scanner teclado = new Scanner(System.in);
        String comando;
        comando = null;
        boolean seArquivos;
        boolean seCalc;
        boolean flavio;
        //Fim da declaração de variaveis
        System.out.println("Iniciando CP-GUI SO");
        System.out.print("root> ");
        comando = teclado.nextLine();
        seArquivos = ("Arquivos".equals(comando));
        seCalc = ("Calculadora".equals(comando));
        if(seArquivos){
            App.setRoot("FileManager.fxml");
        }
        if(seCalc) {
            App.setRoot("CalculadoraInterativa.fxml");
        }
        System.out.print("root> ");
        comando = teclado.nextLine();
        flavio = ("flavio --console".equals(comando));
        if(flavio) {
            byte menu;
            System.out.println("Iniciando Flávio");
            System.out.println("Digite [1] para calcular raiz quadrada");
            System.out.println("Digite [2] para calcular elevação");
            System.out.println("Digite [3] para calcular porsentagem");
            System.out.println("Digite [4] para sair");
            menu = teclado.nextByte();
            if (menu == 1) {
                float resultado = Flavio.calcularRaizQuadrada();
                System.out.println("A raiz quadrada do numero é " + resultado);
            }
        }
    }
}

