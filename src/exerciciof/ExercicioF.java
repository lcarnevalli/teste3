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
public class ExercicioF {

    static String verificaAprovado(float media, int frequencia) {
        String resultado;
        //media = media + 3;
        if ((media >= 6.0) && (frequencia >= 75)) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }
        System.out.println(" Media dentro da funcao =" + media);
        return resultado;
    }
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        System.out.println("Digite a nota");
        float media = leitor.nextFloat();
        System.out.println("Digite a frequencia");
        int freq = leitor.nextInt();
        String situacao;
        situacao = verificaAprovado(media,freq);
        //System.out.println("Media fora da funcao =>" + media);
        System.out.println("O aluno foi " + situacao);
        
        
    }
    
}

