/*
----------------------------------------------------------------
Este Código foi produzido pelo MisterArtKun, vulgo Artur Miguel
Versão: 0.0.2
Data de produção inicial: 14/09/22
Data de Atualização: 19/09/22
----------------------------------------------------------------
O Objetivo deste programa é testar as habilidades Java de seu criador conforme ele progride nesse caminho árduo que é se tornar um desenvolvedor.
Como o Mister é terrível em cálculo, com esse projeto ele procura matar logo dois coelhos com uma só cajadada. rsrsrs
*/

package misterartkun.acalc;

import java.util.Scanner;

/**
 *
 * @author Artur Miguel
 */
public class ACalc {
    static void calcula(byte sw) {// Método responsável pelas operações básicas
        byte i=0;
        float resultado=0;
        do {
            System.out.println("\n----------------------------------------------");
            System.out.println("Digite um valor: ");
            Scanner input = new Scanner(System.in);
            if (i == 0) {
                resultado = input.nextFloat();
                i++;
            }
            else {
                switch (sw) {
                    case 2 -> resultado = resultado + input.nextFloat();
                    case 3 -> resultado = resultado - input.nextFloat();
                    case 4 -> resultado = resultado / input.nextFloat();
                    case 5 -> resultado = resultado * input.nextFloat();
                }
                
                System.out.println("\n----------------------------------------------");
                System.out.printf("Resultado atual: %.1f", resultado);
                System.out.println("\nDeseja continuar operando? (1 - SIM, 0 - NÃO)");
                i = input.nextByte();
                if (i > 1 || i < 0) {
                    System.out.println("\n----------------------------------------------");
                    System.out.print("Insira um número dentro do escopo! (0 - 1)\n");
                    break;
                }
            }
        } while (i != 0);
    }
    
    static void calculaPot(byte sw) {// Método responsável pelo cálculo de potências
        double resultado;
        Scanner input = new Scanner(System.in);
        if (sw == 2) {// Cálculo de Quadrados
            System.out.println("Digite um valor: ");
            resultado = input.nextFloat();
            resultado = resultado * resultado;
        }
        else {// Exponenciação Livre
            double x; 
            int y;
            System.out.println("\n--------------------------------------------------------------------------------------------------------------");
            System.out.println("Para o cálculo de exponenciação livre, é necessário fornecer o valor de X e Y: (Sendo X a base e Y o expoente)");
            System.out.println("\nDigite o valor de X: ");
            x = input.nextInt();
            System.out.println("\nDigite o valor de Y: ");
            y = input.nextInt();
            if (y == 0) {
                resultado = 1;
            }
            else if (y > 0) { // Expoente Positivo
                resultado = x;
                while (y != 1) {
                    resultado = resultado * x;
                    y--;
                }
            }
            else {// Expoente Negativo
                resultado = x;
                while (y != -1) {
                    resultado = resultado * x;
                    y++;
                }
                resultado = 1 / resultado;
            }
        }
        System.out.println("\n----------------------------------------------");
        System.out.printf("Resultado: %f\n", resultado);
    }

    public static void main(String[] args) {
        byte sw;// Esta variável vai armazenar o valor que determinará a navegação pelo menu e cálculos realizados.
        System.out.println("\n----------------------------------------------");
        System.out.println("ACalc - Feito para facilitar a matemática!");        
        
        do {
            System.out.println("----------------------------------------------");
            System.out.println("\nOpções: \n");
            System.out.println("1 - Operações Básicas");
            System.out.println("2 - Potência");
            System.out.println("0 - Sair");
            System.out.println("\nO que deseja realizar?");
        
            Scanner input = new Scanner(System.in);
            
            sw = input.nextByte();
            
            if (sw == 0) {
                System.out.println("\nObrigado por usar o meu programa! :D");
            }
            else if (sw > 2 || sw < 0) {
                System.out.println("\n----------------------------------------------");
                System.out.print("Insira um número dentro do escopo! (0 - 2)\n");
            }
            else {
                switch (sw) {
                    case 1 -> {
                        System.out.println("----------------------------------------------");
                        System.out.println("\nOpções: \n");
                        System.out.println("2 - Somar");
                        System.out.println("3 - Subtrair");
                        System.out.println("4 - Dividir");
                        System.out.println("5 - Multiplicar");
                        System.out.println("1 - Voltar");
                        System.out.println("\nO que deseja realizar?");
                        sw = input.nextByte();
                        if (sw == 1) {
                            break;
                        }
                        else if (sw > 5 || sw < 1) {
                            System.out.println("\n----------------------------------------------");
                            System.out.print("Insira um número dentro do escopo! (1 - 5)\n");
                            break;
                        }
                        else {
                            calcula(sw);// É chamado o método calcula para que o cálculo seja efetuado
                        }
                    }
                    case 2 -> {
                        System.out.println("----------------------------------------------");
                        System.out.println("\nOpções: \n");
                        System.out.println("2 - Quadrado");
                        System.out.println("3 - Exponenciação Livre");
                        System.out.println("1 - Voltar");
                        System.out.println("\nO que deseja realizar?");
                        sw = input.nextByte();
                        if (sw == 1) {
                            break;
                        }
                        else if (sw > 3 || sw < 1) {
                            System.out.println("\n----------------------------------------------");
                            System.out.print("Insira um número dentro do escopo! (1 - 3)\n");
                            break;
                        }
                        else {
                            do {
                                calculaPot(sw);
                                System.out.println("\nDeseja continuar calculando potências?(2 - Quadrado, 3 - E.Livre, 1 - NÃO");
                                sw = input.nextByte();
                                if (sw > 3 || sw < 1) {
                                    System.out.println("\n----------------------------------------------");
                                    System.out.print("Insira um número dentro do escopo! (1 - 3)\n");
                                    break;
                                }
                            } while (sw != 1);
                        }
                    }
                }
            }            
        } while(sw != 0);
    }
}
