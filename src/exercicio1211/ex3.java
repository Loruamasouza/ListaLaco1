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
public class ex3 {
    public static void main(String[] args) {
        double conta, num1 = 0, num2 = 0, contador = 0, resultado = 0, comecar;
            
            while (contador<=2){
                
                comecar=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para começar, ou 2 para encerrar."));
                if ((comecar==1)){
            num1=Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
            num2=Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
            
            conta=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Soma, 2 para Subtração, 3 para multiplicação ou 4 para divisão."));
                if ((conta==1)){
                    resultado=num1+num2;
                }
                if ((conta==2)){
                    resultado=num1-num2;
                }
                if ((conta==3)){
                    resultado=num1*num2;
                }
                if ((conta==4)){
                    resultado=num1/num2;
                }
            
                JOptionPane.showMessageDialog(null,"o resultado da conta é: "+Double.toString(resultado));
            }
                if ((comecar==2)){
                    JOptionPane.showMessageDialog(null,"Conta encerrada.");
                    System.exit(0);
                }
        }
    }
            
}
