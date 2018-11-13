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
public class ex1 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, resul1 = 0, cont1 = 0;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Informe o número que será multiplicado: "));
        while (cont1<=9){
            cont1=cont1+1;
            resul1=cont1*num1;
            JOptionPane.showMessageDialog(null,num1+"x"+cont1+"= "+resul1);
            }
      
    }
}
