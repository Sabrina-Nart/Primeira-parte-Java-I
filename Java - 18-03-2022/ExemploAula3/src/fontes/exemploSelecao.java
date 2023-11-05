
package fontes;

import javax.swing.JOptionPane;

public class exemploSelecao {
    public static void main(String[] args) {
        
        //VERSÃO 1 
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Número 2"));
        int resultado = 0; //Declarado fora
        
        if (numero1==numero2){
            JOptionPane.showMessageDialog(null,"Os números são iguais");
            resultado = numero1 + numero2; //Váriavel declarada dentro do If - só vale aqui
        }else{ //Daqui 
            JOptionPane.showMessageDialog(null, "Os números são diferentes");
            resultado = numero1 * numero2;
        } //Acaba aqui
        JOptionPane.showMessageDialog(null, "O resultado é " + resultado);
        
        //VERSÃO 2 = CONDICIONAL OU TERNÁRIO = MESMO COMANDO, O QUE MUDA É A MENSAGEM, DE ACORDO COM A CONDIÇÃO - Um comando
       //-JOptionPane.showMessageDialog(null,(numero1==numero2) ? "Os números são iguais" : "Os números são diferentes");
       // ? = valor Verdadeiro -- : = Valor Falso - Tem que haver algo antes, aqui mostra a mensagem
       
    }
        
}
