/*
1 - Ler doiJo números inteiros.
Guardar em uma variável "maior" o valor do maior número
-Fazer versão com If e com Ternário

2 - Fazer um programa que leia uma variável inteira e mostre se
o número é Par ou Ímpar com Switch

*/

package fontes;

import javax.swing.JOptionPane;

public class exercicioSelecao {
    public static void main(String[] args) {
       /*
       int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
       int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
       */
       /*
       if (numero1>numero2){ 
           JOptionPane.showMessageDialog(null, "O primeiro número é maior");
       }else{
           JOptionPane.showMessageDialog(null, "O segundo número é maior");
       }
       */
       
       //JOptionPane.showMessageDialog(null,(numero1>numero2) ? "O primeiro número é maior" : "O segundo número é maior");
       
    /////////////////////////////////////////////////////////////////////////////
       
       int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
       
       switch (valor % 2) {
            case 0:
               JOptionPane.showMessageDialog(null, "O número é par");
               break;
            
            case 1:
               JOptionPane.showMessageDialog(null, "O número é ímpar");
               break;
                   
       }
    }
}
