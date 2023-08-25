/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemcp.g.sql.java;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Win10
 */

public class SqlArquivos {
    static Scanner teclado = new Scanner(System.in);
    public static String sqlAlunos(String pessoa) {
        String amandaDado = "<html>Cobra, toda disfarsada, mas por trassss...</html>";
        String viniDado = "<html>Melhor amigo do Arthur, um pouco doido mas divertido</html>";
        if ("Amanda".equals(pessoa)) {
            return amandaDado;
        } else {
            if ("Vinicius".equals(pessoa)) {
                return viniDado;
            } else {
                return null;
            }
        }
    }
    public static void sqlFuncoes(String comando, boolean seArquivos, boolean seCalc) throws IOException {
        boolean flavio;
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
