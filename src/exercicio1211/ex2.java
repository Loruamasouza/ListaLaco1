/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1211;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab01_215
 */
public class ex2 {
    public static void main(String[] args) {
        int idade = 0, resultado = 0, contador = 0, cont1=0;
            while (contador<=10){
                  idade =Integer.parseInt(JOptionPane.showInputDialog("digite a idade:"));
                  contador=contador+1;
                  
                  if (idade<18){
                      cont1=cont1+1;
                              }
                 
            }
                  JOptionPane.showMessageDialog(null, "menores de 18 anos: "+cont1);
                  
                  
        }
    }
