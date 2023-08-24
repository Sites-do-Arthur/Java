/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemcp.g.sql.java;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class Flavio {
    static Scanner teclado = new Scanner(System.in);
    public static float calcularRaizQuadrada() {
        System.out.print("Informe um número: ");
        int n = teclado.nextInt();
        float r = (float) Math.sqrt(n);
        return(r);
    }
}
