
package fontes;

import javax.swing.JOptionPane;

public class exemploSwitch {  //CRITÉRIO EM JAVA, PRIMEIRA MINUSCULA, RESTO MAIUSCULA
    public static void main(String[] args) {
        
        String resposta=JOptionPane.showInputDialog("Continua Sim ou Não");

        switch (resposta) { //A partir do primeiro verdadeiro, ele não para
            case "S":    
            case "s":
                JOptionPane.showMessageDialog(null, "Sim");
                break; //Break = para - Não precisa continuar, se é sim é sim, não é não
            case "N":  
            case "n":
                JOptionPane.showMessageDialog(null, "Não");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Incorreto");
        }
        
    }
    
}
