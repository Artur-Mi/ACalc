/*
----------------------------------------------------------------
Este Código foi produzido pelo MisterArtKun, vulgo Artur Miguel
Versão: 0.0.1
Data de produção inicial: 14/09/22
Data de Atualização: 14/09/22
----------------------------------------------------------------
O Objetivo deste programa é testar as habilidades Java de seu criador conforme ele progride nesse caminho árduo que é se tornar um desenvolvedor.
Como o Mister é terrível em cálculo, com esse projeto ele procura matar logo dois coelhos com uma só cajadada. rsrsrs
*/

package com.mister.acalc;

import java.util.Scanner;

/**
 *
 * @author Artur Miguel
 */
public class ACalc {
    static void calcula(int sw){
        int i=0;
        float resultado=0;
        do {
            System.out.println("\nDigite um valor: ");
            Scanner input = new Scanner(System.in);
            if (i == 0){
                resultado = input.nextFloat();
                i++;
            }
            else {
                switch (sw){
                    case 1 -> resultado = resultado + input.nextFloat();
                    case 2 -> resultado = resultado - input.nextFloat();
                    case 3 -> resultado = resultado / input.nextFloat();
                    case 4 -> resultado = resultado * input.nextFloat();
                }
                
                System.out.println("----------------------------------------------");
                System.out.printf("Resultado atual: %.1f", resultado);
                System.out.println("\nDeseja continuar operando? (1 - SIM, 0 - NÃO)");
                i = input.nextInt();
            }
        } while (i != 0);
    }

    public static void main(String[] args) {
        int sw;// Esta variável vai armazenar o valor que determinará o tipo de cálculo desejado.
        System.out.println("\n----------------------------------------------");
        System.out.println("ACalc - Feito para facilitar a matemática!");        
        
        do {
            System.out.println("----------------------------------------------");
            System.out.println("\nOpções: \n");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Dividir");
            System.out.println("4 - Multiplicar");
            System.out.println("0 - Sair");
            System.out.println("\nO que deseja realizar?");
        
            Scanner input = new Scanner(System.in);
            
            sw = input.nextInt();
            
            if (sw == 0){
                System.out.println("\nObrigado por usar o meu programa! :D");
            }
            else if (sw > 4 || sw < 0) {
                System.out.println("Insira um número dentro do escopo! (1 - 4)");
            }
            else {
                calcula(sw);// É chamado o método calcula para que o cálculo seja efetuado
            }            
        } while(sw != 0);
    }
}
