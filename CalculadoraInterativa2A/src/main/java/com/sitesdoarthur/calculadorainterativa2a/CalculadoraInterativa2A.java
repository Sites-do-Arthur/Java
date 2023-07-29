/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sitesdoarthur.calculadorainterativa2a;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class CalculadoraInterativa2A {

    public static void main(String[] args) {
        //Declaração das variaveis
        String nome;
        byte idade;
        byte menu;
        Scanner teclado = new Scanner(System.in);
        //Fim da declaração das variaveis
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.format("Bem vindo %S Digite a sua idade: ", nome);
        idade = teclado.nextByte();
        System.out.printf("%S de " + idade + " anos, escolha uma opção abaixo: \n", nome);
        System.out.println("Digite [1] para Adição");
    }
}
