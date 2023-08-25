/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package systemcp.g;

import java.io.IOException;
import java.util.Scanner;
import systemcp.g.sql.java.SqlArquivos;

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
        SqlArquivos.sqlFuncoes(comando, seArquivos, seCalc);
    }
}

