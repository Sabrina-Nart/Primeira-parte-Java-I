
package Exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        
      double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da mercadoria "));
      double novoPreco = preco * ((preco > 10) ? 0.9 : 9.925); //0.9  0.925 - ? e : determina por qual multiplica- essa variável não é obrigatória
      
      JOptionPane.showMessageDialog(null, "O novo preço será " + novoPreco);
           
    }
            
}
