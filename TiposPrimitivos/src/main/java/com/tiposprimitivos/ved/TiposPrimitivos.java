/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tiposprimitivos.ved;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();
        System.out.print("Digite a nota do Aluno " + nome + ": ");
        float nota;
        nota = entrada.nextFloat();
        System.out.format("A nota de %s é %.1f \n", nome, nota);
    }
}
