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
public class ExercicioEleicaoGremio {
    public static void main(String[] args) {
     
        double votos = 0, ChapaA = 0, ChapaB = 0, nulo = 0;
        while (votos!=-1){
            
            votos=Double.parseDouble(JOptionPane.showInputDialog("Vote 1 para ChapaA, Vote 2 para ChapaB"));
            if ((votos==1)){
                ChapaA = 1 + ChapaA;
                
            }
            if ((votos==2)){
                ChapaB = 1 + ChapaB;
                
            }
            if ((votos>=3)){
                nulo = nulo + 1;
                
            }
        }
            if ((ChapaA>ChapaB)){
                JOptionPane.showMessageDialog(null,"A chapa eleita foi a ChapaA, com "+ Double.toString(ChapaA)+ " votos. A ChapaB teve "+ Double.toString(ChapaB)+" votos, e houveram "+ Double.toString(nulo)+ " votos nulos.");   
                 }
            else if ((ChapaB>ChapaA)){
                JOptionPane.showMessageDialog(null,"A chapa eleita foi a ChapaB, com "+ Double.toString(ChapaB)+ " votos. A ChapaA teve "+ Double.toString(ChapaA)+" votos, e houveram "+ Double.toString(nulo)+ " votos nulos.");
        }
        
    }
}
