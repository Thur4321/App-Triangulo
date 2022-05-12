
package triângulo;

import javax.swing.JOptionPane;

public class Triângulo {

    public static void main(String[] args) {
        
        float ladoA=Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o primeiro lado do triângulo:","AppAluno",3));
        
        float ladoB=Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o segundo lado do triângulo:","AppAluno",3));
        
        float ladoC=Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o terceiro lado do triângulo:","AppAluno",3));
        
        CaracterísticasTriângulo objCaracterísticas = new CaracterísticasTriângulo();
       
        objCaracterísticas.setLadoA(ladoA);
        objCaracterísticas.setLadoB(ladoB);
        objCaracterísticas.setLadoC(ladoC);
        
        JOptionPane.showMessageDialog(null, "Tipo do triângulo: "+objCaracterísticas.tipo(),"AppAluno",1);
    }
    
}
