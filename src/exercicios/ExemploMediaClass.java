/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab01_215
 */
public class ExemploMediaClass {
    public static void main(String[] args) {
        int cont=0;
        double notas=0, soma = 0, media;
        while(notas!=-1){ //o laço para de executar quando a nota for -1
         
            notas=Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do aluno: "));
            if (notas!=-1){
            soma=notas+soma; //acumulador da soma das notas
            cont=cont+1; //contador das notas
            }
        }
        media=soma/cont; //media da classe
        JOptionPane.showMessageDialog(null,"Média da classe: "+ Double.toString(media));
        
    }
}
