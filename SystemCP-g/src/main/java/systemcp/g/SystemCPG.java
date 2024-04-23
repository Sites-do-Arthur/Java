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
        boolean repet = true;
        boolean seArquivos;
        boolean seCalc;
        //Fim da declaração de variaveis
        do {
            System.out.println("Iniciando CP-GUI SO");
            System.out.print("root> ");
            comando = teclado.nextLine();
            seArquivos = ("Arquivos".equals(comando));
            seCalc = ("Calculadora".equals(comando));
            SqlArquivos.sqlFuncoes(comando, seArquivos, seCalc);
            if(seCalc) {
                System.out.print("Informe o primeiro número: ");
                int n1 = teclado.nextInt();
                System.out.print("Informe o último número: ");
                int n2 = teclado.nextInt();
                calc(n1, n2, 's');
            }
       } while(repet == true);
    }
    

    public static void calc(int n1, int n2, char op) {
	if(op == 's') {
		int r = n1 + n2;
        System.out.print("A soma é de " + r);
	}
    }
}

