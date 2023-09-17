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
        System.out.println("Digite [2] para Subtração");
        System.out.printf("%S, caso você queira mais opções baixe agora a Calculadora Interativa 2B ou 2A+, \n", nome);
        System.out.printf("a Calculadora Interativa 2A não tem suporte para outras opções, em caso de duvida \n");
        System.out.printf("consulte mais informações em https://sites-do-arthur.github.io/calculadora-interariva/sobre.html \n");
        System.out.println("E precione [ENTER] no fim da escolha para comfirmar");
        menu = teclado.nextByte();
        
    }
}
