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

package misterartkun.acalc;

import java.util.Scanner;

/**
 *
 * @author Artur Miguel
 */
public class ACalc {
    static void calcula(int sw) {// Método responsável pelas operações básicas
        int i=0;
        float resultado=0;
        do {
            System.out.println("\n----------------------------------------------");
            System.out.println("\nDigite um valor: ");
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
                
                System.out.println("----------------------------------------------");
                System.out.printf("Resultado atual: %.1f", resultado);
                System.out.println("\nDeseja continuar operando? (1 - SIM, 0 - NÃO)");
                i = input.nextInt();
            }
        } while (i != 0);
    }
    
    static void calculaPot(int sw) {
        float resultado;
        Scanner input = new Scanner(System.in);
        if (sw == 2) {
            System.out.println("Digite um valor: ");
            resultado = input.nextFloat();
            resultado = resultado * resultado;
        }
        else {
            float x; 
            int y;
            System.out.println("Para o cálculo de exponenciação livre, é necessário fornecer o valor de X e Y: (Sendo X a base e Y o expoente)");
            System.out.println("Digite o valor de X: ");
            x = input.nextInt();
            System.out.println("Digite o valor de Y: ");
            y = input.nextInt();
            if (y == 0) {
                resultado = 1;
            }
            else if (y > 0) {
                resultado = x;
                while (y != 1) {
                    resultado = resultado * x;
                    y--;
                }
            }
            else {
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
        int sw;// Esta variável vai armazenar o valor que determinará o tipo de cálculo desejado.
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
            
            sw = input.nextInt();
            
            if (sw == 0) {
                System.out.println("\nObrigado por usar o meu programa! :D");
            }
            else if (sw > 2 || sw < 0) {
                System.out.println("\n----------------------------------------------");
                System.out.print("Insira um número dentro do escopo! (0 - 4)\n");
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
                        sw = input.nextInt();
                        if (sw == 1) {
                            break;
                        }
                        else if (sw > 5 || sw < 1) {
                            System.out.println("\n----------------------------------------------");
                            System.out.print("Insira um número dentro do escopo! (1 - 5)\n");
                        }
                        else {
                            calcula(sw);// É chamado o método calcula para que o cálculo seja efetuado
                        }
                    }
                    case 2 -> {
                        System.out.println("----------------------------------------------");
                        System.out.println("\nOpções: \n");
                        System.out.println("2 - Quadrado");
                        System.out.println("3 - Exponenciação");
                        System.out.println("1 - Voltar");
                        System.out.println("\nO que deseja realizar?");
                        sw = input.nextInt();
                        if (sw == 1) {
                            break;
                        }
                        else if (sw > 3 || sw < 1) {
                            System.out.println("\n----------------------------------------------");
                            System.out.print("Insira um número dentro do escopo! (1 - 5)\n");
                        }
                        else {
                            do {
                                calculaPot(sw);
                                System.out.println("\nDeseja continuar calculando potências?(2 - Quadrados, 3 - E.Livre, 1 - NÃO");
                                sw = input.nextInt();
                            } while (sw != 1);
                        }
                    }
                }
            }            
        } while(sw != 0);
    }
}
