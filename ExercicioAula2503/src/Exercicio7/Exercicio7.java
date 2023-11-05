
package Exercicio7;

import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número "));
        
        int resultado = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Soma, 2 para Subtração, 3 para Multiplicação ou 4 para Divisão"));
        
        switch (resultado) {
            case 1:
                JOptionPane.showMessageDialog(null, "O resultado da soma será " + (numero1 + numero2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O resultado da subtração será " + (numero1 - numero2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O resultado da subtração será " + (numero1 * numero2));
                break;
            case 4:
                if (numero2==0) {
                    JOptionPane.showMessageDialog(null, "Impossível fazer a divisão por zero, escolha outro número");
                }else{
                    JOptionPane.showMessageDialog(null, "O resultado da divisão será " + (numero1 /(double)numero2));
                break;
                }
                
            default:
                
        }
              
    }    
    
}
