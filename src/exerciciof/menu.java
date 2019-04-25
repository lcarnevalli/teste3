/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciof;

import java.util.Scanner;

/**
 *
 * @author leonildo.cjunior
 */
public class menu {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        montarMenu();
        int opcao_digitada = lerOpcao();
        if (opcao_digitada != 4){
            System.out.println("Jogar");
        }
    }

    public static void montarMenu() {
        System.out.println("1) Jogar é");
        System.out.println("2) Ver Placar");
        System.out.println("3) Créditos");
        System.out.println("4) Sair");

    }

    public static int lerOpcao() {
        int opcao;
        do {
            System.out.println("****");
            System.out.println("Digite a opcao desejada (1 a 4)==>");
             opcao = leitor.nextInt();
            if (opcao < 1 || opcao > 4) {
                System.out.println("Opcao Invalida");
            }
        } while ((opcao < 1 || opcao > 4));
        return opcao;
    }
}
